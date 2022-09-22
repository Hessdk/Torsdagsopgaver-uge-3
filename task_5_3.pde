boolean jobsDone = false;

void setup()
{
    if (isJobDone())
    {
        println("Job's done!");   
    }
}

boolean isJobDone() // Rettede void til boolean
{
    return !jobsDone;     // Satte ! på jobsDone for at få den til at printe
}
