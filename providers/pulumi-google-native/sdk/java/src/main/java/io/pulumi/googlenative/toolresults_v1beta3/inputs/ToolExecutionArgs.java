// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.FileReferenceArgs;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.ToolExitCodeArgs;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.ToolOutputReferenceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An execution of an arbitrary tool. It could be a test runner or a tool copying artifacts or deploying code.
 * 
 */
public final class ToolExecutionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ToolExecutionArgs Empty = new ToolExecutionArgs();

    /**
     * The full tokenized command line including the program name (equivalent to argv in a C program). - In response: present if set by create request - In create request: optional - In update request: never set
     * 
     */
    @Import(name="commandLineArguments")
      private final @Nullable Output<List<String>> commandLineArguments;

    public Output<List<String>> getCommandLineArguments() {
        return this.commandLineArguments == null ? Output.empty() : this.commandLineArguments;
    }

    /**
     * Tool execution exit code. This field will be set once the tool has exited. - In response: present if set by create/update request - In create request: optional - In update request: optional, a FAILED_PRECONDITION error will be returned if an exit_code is already set.
     * 
     */
    @Import(name="exitCode")
      private final @Nullable Output<ToolExitCodeArgs> exitCode;

    public Output<ToolExitCodeArgs> getExitCode() {
        return this.exitCode == null ? Output.empty() : this.exitCode;
    }

    /**
     * References to any plain text logs output the tool execution. This field can be set before the tool has exited in order to be able to have access to a live view of the logs while the tool is running. The maximum allowed number of tool logs per step is 1000. - In response: present if set by create/update request - In create request: optional - In update request: optional, any value provided will be appended to the existing list
     * 
     */
    @Import(name="toolLogs")
      private final @Nullable Output<List<FileReferenceArgs>> toolLogs;

    public Output<List<FileReferenceArgs>> getToolLogs() {
        return this.toolLogs == null ? Output.empty() : this.toolLogs;
    }

    /**
     * References to opaque files of any format output by the tool execution. The maximum allowed number of tool outputs per step is 1000. - In response: present if set by create/update request - In create request: optional - In update request: optional, any value provided will be appended to the existing list
     * 
     */
    @Import(name="toolOutputs")
      private final @Nullable Output<List<ToolOutputReferenceArgs>> toolOutputs;

    public Output<List<ToolOutputReferenceArgs>> getToolOutputs() {
        return this.toolOutputs == null ? Output.empty() : this.toolOutputs;
    }

    public ToolExecutionArgs(
        @Nullable Output<List<String>> commandLineArguments,
        @Nullable Output<ToolExitCodeArgs> exitCode,
        @Nullable Output<List<FileReferenceArgs>> toolLogs,
        @Nullable Output<List<ToolOutputReferenceArgs>> toolOutputs) {
        this.commandLineArguments = commandLineArguments;
        this.exitCode = exitCode;
        this.toolLogs = toolLogs;
        this.toolOutputs = toolOutputs;
    }

    private ToolExecutionArgs() {
        this.commandLineArguments = Output.empty();
        this.exitCode = Output.empty();
        this.toolLogs = Output.empty();
        this.toolOutputs = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ToolExecutionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> commandLineArguments;
        private @Nullable Output<ToolExitCodeArgs> exitCode;
        private @Nullable Output<List<FileReferenceArgs>> toolLogs;
        private @Nullable Output<List<ToolOutputReferenceArgs>> toolOutputs;

        public Builder() {
    	      // Empty
        }

        public Builder(ToolExecutionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commandLineArguments = defaults.commandLineArguments;
    	      this.exitCode = defaults.exitCode;
    	      this.toolLogs = defaults.toolLogs;
    	      this.toolOutputs = defaults.toolOutputs;
        }

        public Builder commandLineArguments(@Nullable Output<List<String>> commandLineArguments) {
            this.commandLineArguments = commandLineArguments;
            return this;
        }

        public Builder commandLineArguments(@Nullable List<String> commandLineArguments) {
            this.commandLineArguments = Output.ofNullable(commandLineArguments);
            return this;
        }

        public Builder exitCode(@Nullable Output<ToolExitCodeArgs> exitCode) {
            this.exitCode = exitCode;
            return this;
        }

        public Builder exitCode(@Nullable ToolExitCodeArgs exitCode) {
            this.exitCode = Output.ofNullable(exitCode);
            return this;
        }

        public Builder toolLogs(@Nullable Output<List<FileReferenceArgs>> toolLogs) {
            this.toolLogs = toolLogs;
            return this;
        }

        public Builder toolLogs(@Nullable List<FileReferenceArgs> toolLogs) {
            this.toolLogs = Output.ofNullable(toolLogs);
            return this;
        }

        public Builder toolOutputs(@Nullable Output<List<ToolOutputReferenceArgs>> toolOutputs) {
            this.toolOutputs = toolOutputs;
            return this;
        }

        public Builder toolOutputs(@Nullable List<ToolOutputReferenceArgs> toolOutputs) {
            this.toolOutputs = Output.ofNullable(toolOutputs);
            return this;
        }
        public ToolExecutionArgs build() {
            return new ToolExecutionArgs(commandLineArguments, exitCode, toolLogs, toolOutputs);
        }
    }
}
