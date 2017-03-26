package com.creactiviti.piper.core.task;

/**
 * A strategy interface used by implementations who are 
 * responsible for executing {@link JobTask} instances.
 * 
 * @author Arik Cohen
 * @since Mar 26, 2017
 */
public interface TaskExecutor {

  /**
   * Executes a {@link JobTask} instance.
   * 
   * @param aTask
   *          The task to execute
   */
  void execute (JobTask aTask);

}