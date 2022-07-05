// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.notebooks.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.notebooks.v1.inputs.ExecutionTemplateArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExecutionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExecutionArgs Empty = new ExecutionArgs();

    /**
     * A brief description of this execution.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A brief description of this execution.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Required. User-defined unique ID of this execution.
     * 
     */
    @Import(name="executionId", required=true)
    private Output<String> executionId;

    /**
     * @return Required. User-defined unique ID of this execution.
     * 
     */
    public Output<String> executionId() {
        return this.executionId;
    }

    /**
     * execute metadata including name, hardware spec, region, labels, etc.
     * 
     */
    @Import(name="executionTemplate")
    private @Nullable Output<ExecutionTemplateArgs> executionTemplate;

    /**
     * @return execute metadata including name, hardware spec, region, labels, etc.
     * 
     */
    public Optional<Output<ExecutionTemplateArgs>> executionTemplate() {
        return Optional.ofNullable(this.executionTemplate);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Output notebook file generated by this execution
     * 
     */
    @Import(name="outputNotebookFile")
    private @Nullable Output<String> outputNotebookFile;

    /**
     * @return Output notebook file generated by this execution
     * 
     */
    public Optional<Output<String>> outputNotebookFile() {
        return Optional.ofNullable(this.outputNotebookFile);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private ExecutionArgs() {}

    private ExecutionArgs(ExecutionArgs $) {
        this.description = $.description;
        this.executionId = $.executionId;
        this.executionTemplate = $.executionTemplate;
        this.location = $.location;
        this.outputNotebookFile = $.outputNotebookFile;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExecutionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExecutionArgs $;

        public Builder() {
            $ = new ExecutionArgs();
        }

        public Builder(ExecutionArgs defaults) {
            $ = new ExecutionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A brief description of this execution.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A brief description of this execution.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param executionId Required. User-defined unique ID of this execution.
         * 
         * @return builder
         * 
         */
        public Builder executionId(Output<String> executionId) {
            $.executionId = executionId;
            return this;
        }

        /**
         * @param executionId Required. User-defined unique ID of this execution.
         * 
         * @return builder
         * 
         */
        public Builder executionId(String executionId) {
            return executionId(Output.of(executionId));
        }

        /**
         * @param executionTemplate execute metadata including name, hardware spec, region, labels, etc.
         * 
         * @return builder
         * 
         */
        public Builder executionTemplate(@Nullable Output<ExecutionTemplateArgs> executionTemplate) {
            $.executionTemplate = executionTemplate;
            return this;
        }

        /**
         * @param executionTemplate execute metadata including name, hardware spec, region, labels, etc.
         * 
         * @return builder
         * 
         */
        public Builder executionTemplate(ExecutionTemplateArgs executionTemplate) {
            return executionTemplate(Output.of(executionTemplate));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param outputNotebookFile Output notebook file generated by this execution
         * 
         * @return builder
         * 
         */
        public Builder outputNotebookFile(@Nullable Output<String> outputNotebookFile) {
            $.outputNotebookFile = outputNotebookFile;
            return this;
        }

        /**
         * @param outputNotebookFile Output notebook file generated by this execution
         * 
         * @return builder
         * 
         */
        public Builder outputNotebookFile(String outputNotebookFile) {
            return outputNotebookFile(Output.of(outputNotebookFile));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public ExecutionArgs build() {
            $.executionId = Objects.requireNonNull($.executionId, "expected parameter 'executionId' to be non-null");
            return $;
        }
    }

}
