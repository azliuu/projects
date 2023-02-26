import React from "react";
import { Box, Typography, Stack, Card } from "@mui/material";

export default function Landing() {
  return (
    <Box
      height="100vh"
      width="100vw"
      sx={{ flexGrow: 1, backgroundColor: "background.default" }}
      //   sx={{ flexGrow: 1, backgroundColor: "#BCAD86" }}
      //   sx={{ flexGrow: 1, backgroundColor: "#ABDEF8" }}
      //   sx={{ flexGrow: 1, backgroundColor: "#FFFFFF" }}
    >
      <Stack spacing={2} direction="column" alignItems="center">
        <Typography
          sx={{
            fontSize: 80,
            fontWeight: "bold",
            color: "primary.main",
            textAlign: "left",
            margin: 2,
            padding: 2,
          }}
        >
          I'm Alex Liu, a CS student at UC Santa Cruz.
        </Typography>
        <Box
          component="img"
          src="/portfolio_photo.jpg"
          sx={{
            height: "100vh",
          }}
        />
      </Stack>
      <Stack spacing={2} direction="column" alignItems="center"></Stack>
      <Stack
        spacing={2}
        direction="column"
        alignItems="center"
        paddingLeft={"28vh"}
        paddingRight={"28vh"}
      >
        <Card sx={{ height: "50vh", width: "70vw" }}>
          <Typography
            sx={{
              fontSize: 40,
              fontWeight: "bold",
              color: "primary.main",
              textAlign: "center",
              margin: 2,
              padding: 2,
            }}
          >
            primary.main
          </Typography>

          <Typography
            sx={{
              fontSize: 40,
              fontWeight: "bold",
              color: "secondary.main",
              textAlign: "center",
              margin: 2,
              padding: 2,
            }}
          >
            secondary.main
          </Typography>
        </Card>
      </Stack>
      <Stack spacing={2} direction="column" alignItems="center"></Stack>
    </Box>
  );
}
