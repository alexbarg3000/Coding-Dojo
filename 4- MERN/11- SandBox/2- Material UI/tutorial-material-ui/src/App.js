import logo from './logo.svg';
import React, {useState} from "react";
import './App.css';
import Button from '@material-ui/core/Button'
import SaveIcon from "@material-ui/icons/Save"
import {ButtonGroup} from "@material-ui/core";
import DeleteIcon from "@material-ui/icons/Delete"
import Checkbox from "@material-ui/core/Checkbox"
import FormControlLabel from "@material-ui/core/FormControlLabel"
import TextField from "@material-ui/core/TextField"

import {makeStyles, ThemeProvider, createMuiTheme} from "@material-ui/core/styles"
import {green,blueGrey, lime} from "@material-ui/core/colors";
import "fontsource-roboto";
import Typography from "@material-ui/core/Typography"
// import Container from "@material-ui/core/Container"
import * as Mui from "@material-ui/core"
import * as MuiIcons from "@material-ui/icons"





const useStyles = makeStyles({
    root: {
        background: "linear-gradient(45deg, #FE6B8B, #FF8E53)",
        border: 0,
        borderRadius: 15,
        color: "white",
        padding: "5px 30px",
        marginBottom: 15
    }
})

const theme = createMuiTheme({
    typography:{
        h2:{
            fontSize:36,
        }
    },

    palette: {
        primary: {
            main: lime[500],
        },
        secondary: {
            main: green[500],
        }
    }

})

function ButtonStyled() {
    const classes = useStyles();
    return <Button className={classes.root}>Test Styled Button</Button>
}

function CheckboxExample() {
    const [checked, setChecked] = useState(true);
    return (
        <FormControlLabel
            control={<Checkbox
                checked={checked}
                icon={<DeleteIcon/>}
                checkedIcon={<SaveIcon/>}
                onChange={(e) => setChecked(e.target.checked)}
                inputProps={{
                    "aria-label": "secondary checkbox"
                }}
            />}
            label={"Testing Checkbox"}
        />

    );
}


function App() {
    return (
        <ThemeProvider theme={theme}>
            <Mui.Container maxWidth={"lg"}>

                <div className="App" style={{marginTop:"56px"}}>
                    <header className="App-header">
                        <Mui.AppBar color={"secondary"}>
                            <Mui.Toolbar>
                                <Mui.IconButton>
                                    <MuiIcons.Menu />
                                </Mui.IconButton>
                                <Mui.Typography variant={"h6"}>
                                    MUI  Theming
                                </Mui.Typography>
                                <Mui.Button>
                                    Login
                                </Mui.Button>
                            </Mui.Toolbar>
                        </Mui.AppBar>
                        <Typography
                            variant={"h2"}
                            component={"div"}
                        >
                            Welcome to MUI
                        </Typography>
                        <Typography
                            variant={"subtitle1"}
                        >
                            Learn how to use Material UI
                        </Typography>
                        <ButtonStyled/>

                        <Mui.Grid container spacing={2} justify="center">
                            <Mui.Grid item xs={12} sm={6} xl={3}>
                                <Mui.Paper style={{
                                    height: 75, width: "100%"
                                }}/>
                            </Mui.Grid>
                            <Mui.Grid item xs={12} sm={6} xl={3} >
                                <Mui.Paper style={{
                                    height: 75, width: "100%"
                                }}/>
                            </Mui.Grid>
                            <Mui.Grid item xs={12} sm={6} xl={3}>
                                <Mui.Paper style={{
                                    height: 75, width: "100%"
                                }}/>
                            </Mui.Grid>
                        </Mui.Grid>

                        <TextField
                            variant={"outlined"}
                            color={"secondary"}
                            type={"email"}
                            label={"Email"}
                            placeholder={"test@test.com"}
                        />
                        <CheckboxExample/>
                        <img src={logo} className="App-logo" alt="logo"/>
                        <ButtonGroup
                            variant={"contained"}
                        >
                                <Button
                                    startIcon={<SaveIcon/>}
                                    onClick={() => alert("Save is complete!!")}
                                    color={"primary"}
                                    size={"large"}
                                    style={
                                        {fontSize: 30}
                                    }
                                >
                                Save!
                            </Button>
                            <Button
                                endIcon={<DeleteIcon/>}
                                onClick={() => alert("Item is discarded!")}
                                color={"secondary"}
                                size={"large"}
                                style={
                                    {fontSize: 18}
                                }
                            >
                                Discard!
                            </Button>
                        </ButtonGroup>
                    </header>
                </div>
            </Mui.Container>
        </ThemeProvider>

    );
}

export default App;
