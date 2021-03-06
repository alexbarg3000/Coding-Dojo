const express = require("express");
const faker = require("faker");
const app = express();


// req is short for request
// res is short for response

class User {
  constructor() {
      this.__id = 0;
      this.firstName = faker.name.firstName();
      this.lastName = faker.name.lastName();
      this.phoneNumber = faker.phone.phoneNumber();
      this.email = this.lastName + "." + this.firstName + "@email.com";
      this.password = faker.internet.password();
  };
};

class Address {
  constructor() {
      this.street = faker.address.streetName();
      this.city = faker.address.city();
      this.state = faker.address.state();
      this.zipCode = faker.address.zipCode();
      // this.country = "United State of America";
      this.country = faker.address.country();
  };
};


class Company {
  constructor() {
      this.__id = 0;
      this.companyName = faker.company.companyName();
      this.address = new Address();

  }
}


// set api address here
app.get("/api/users/new", (req, res) => {
  const user = new User();
  return res.json(user);
});

app.get("/api/companies/new", (req, res) => {
  const company = new Company();
  return res.json(company);
});

app.get("/api/user/company", (req, res) => {
  const user = new User();

  const company = new Company();
  return res.json({ user: user, company: company });
});

const server = app.listen(8000, () =>
  console.log(`API is locked and loaded on port ${server.address().port}!`))

//By Alex


app.get("/api", (req, res) => {
  res.send("Our express api server is now sending this over to the browser");
});

