import { createTheme } from "@mui/material/styles";

export const themeOptions = createTheme({
  palette: {
    type: "light",
    primary: {
      main: "#f79b9b",
      dark: "#000000",
      contrastText: "#212121",
    },
    secondary: {
      main: "#ff4081",
      dark: "#ffc6dc",
      contrastText: "#000000",
    },
    background: {
      default: "#8d6e63",
      paper: "#f9ceb3",
    },
    text: {
      primary: "#000000",
    },
  },
});
