boolean jobsDone = true;

void setup()
{
    if (isJobDone())
    {
        println("Job's done!"); // Indsat semikolon
    }
}

boolean isJobDone()
{
    return jobsDone;    
}
