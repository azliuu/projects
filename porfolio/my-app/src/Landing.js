import React from "react";
import {Box, Typography, Stack, Button} from '@mui/material';

export default function Landing() {
    return (
        <Box sx={{ flexGrow: 1 }}>
        <Stack spacing={2} direction="column" alignItems="center">
            <Typography sx={{
                fontSize: 80,
                fontWeight: 'bold',
                color: 'primary.main',
                textAlign: 'center',
                margin: 2,
                padding: 2,
            }}
            >
           cool website design
            </Typography>
        </Stack>
        <Stack spacing={2} direction="column" alignItems="center">
            <Typography sx={{
                fontSize: 40,
                fontWeight: 'bold',
                color: 'primary.main',
                textAlign: 'center',
                margin: 2,
                padding: 2,
            }}
            >
              this is the subtitle
            </Typography>
        </Stack>
        </Box>
    );
    }