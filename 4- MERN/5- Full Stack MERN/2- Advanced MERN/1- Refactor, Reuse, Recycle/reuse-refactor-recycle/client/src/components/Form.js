import React, { useState } from "react";
import { StyledButton, StyledFields, StyledForm } from "./StyledComponents";

export default ({ onSubmitProps, titleProps, priceProps, descProps }) => {
    const [title, setTitle] = useState(titleProps);
    const [price, setPrice] = useState(priceProps);
    const [desc, setDesc] = useState(descProps);

    const onSubmit = (e) => {
        // e.preventDefault();
        onSubmitProps({ title, price, desc })
    };

    return (
        <StyledForm onSubmit={onSubmit}>
            <StyledFields>
                <label htmlFor="Title">Title: </label>
                <input cols="30" rows="5" name="Title" type="text" value={title} onChange={(e) => setTitle(e.target.value)} />
            </StyledFields>
            <StyledFields>
                <label htmlFor="Price">Price: </label>
                <input cols="30" rows="5" name="Price" type="number" onChange={(e) => setPrice(e.target.value)} value={price} />
            </StyledFields>
            <StyledFields>
                <label htmlFor="Desc">Description: </label>
                <textarea cols="28" rows="7" name="Desc" onChange={(e) => setDesc(e.target.value)} value={desc} />
            </StyledFields>
            <StyledButton>Submit</StyledButton>
        </StyledForm>
    );
};