// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.FileReferenceArgs;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.TestCaseReferenceArgs;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.TimestampArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A reference to a ToolExecution output file.
 * 
 */
public final class ToolOutputReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ToolOutputReferenceArgs Empty = new ToolOutputReferenceArgs();

    /**
     * The creation time of the file. - In response: present if set by create/update request - In create/update request: optional
     * 
     */
    @InputImport(name="creationTime")
      private final @Nullable Input<TimestampArgs> creationTime;

    public Input<TimestampArgs> getCreationTime() {
        return this.creationTime == null ? Input.empty() : this.creationTime;
    }

    /**
     * A FileReference to an output file. - In response: always set - In create/update request: always set
     * 
     */
    @InputImport(name="output")
      private final @Nullable Input<FileReferenceArgs> output;

    public Input<FileReferenceArgs> getOutput() {
        return this.output == null ? Input.empty() : this.output;
    }

    /**
     * The test case to which this output file belongs. - In response: present if set by create/update request - In create/update request: optional
     * 
     */
    @InputImport(name="testCase")
      private final @Nullable Input<TestCaseReferenceArgs> testCase;

    public Input<TestCaseReferenceArgs> getTestCase() {
        return this.testCase == null ? Input.empty() : this.testCase;
    }

    public ToolOutputReferenceArgs(
        @Nullable Input<TimestampArgs> creationTime,
        @Nullable Input<FileReferenceArgs> output,
        @Nullable Input<TestCaseReferenceArgs> testCase) {
        this.creationTime = creationTime;
        this.output = output;
        this.testCase = testCase;
    }

    private ToolOutputReferenceArgs() {
        this.creationTime = Input.empty();
        this.output = Input.empty();
        this.testCase = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ToolOutputReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TimestampArgs> creationTime;
        private @Nullable Input<FileReferenceArgs> output;
        private @Nullable Input<TestCaseReferenceArgs> testCase;

        public Builder() {
    	      // Empty
        }

        public Builder(ToolOutputReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.output = defaults.output;
    	      this.testCase = defaults.testCase;
        }

        public Builder setCreationTime(@Nullable Input<TimestampArgs> creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder setCreationTime(@Nullable TimestampArgs creationTime) {
            this.creationTime = Input.ofNullable(creationTime);
            return this;
        }

        public Builder setOutput(@Nullable Input<FileReferenceArgs> output) {
            this.output = output;
            return this;
        }

        public Builder setOutput(@Nullable FileReferenceArgs output) {
            this.output = Input.ofNullable(output);
            return this;
        }

        public Builder setTestCase(@Nullable Input<TestCaseReferenceArgs> testCase) {
            this.testCase = testCase;
            return this;
        }

        public Builder setTestCase(@Nullable TestCaseReferenceArgs testCase) {
            this.testCase = Input.ofNullable(testCase);
            return this;
        }
        public ToolOutputReferenceArgs build() {
            return new ToolOutputReferenceArgs(creationTime, output, testCase);
        }
    }
}
