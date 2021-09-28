export class Task{
    taskId !: number;
    ownerId!: number;
    name!: string;
    description!:string;
    status!: string;
    priority!:string;
    notes!:string;
    isBookmarked!:number;
    createdOn!: Date;
    statusChangedOn !:Date;
}

