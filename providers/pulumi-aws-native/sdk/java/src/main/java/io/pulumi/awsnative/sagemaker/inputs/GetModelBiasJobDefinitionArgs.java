// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetModelBiasJobDefinitionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetModelBiasJobDefinitionArgs Empty = new GetModelBiasJobDefinitionArgs();

    /**
     * The Amazon Resource Name (ARN) of job definition.
     * 
     */
    @InputImport(name="jobDefinitionArn", required=true)
        private final String jobDefinitionArn;

    public String getJobDefinitionArn() {
        return this.jobDefinitionArn;
    }

    public GetModelBiasJobDefinitionArgs(String jobDefinitionArn) {
        this.jobDefinitionArn = Objects.requireNonNull(jobDefinitionArn, "expected parameter 'jobDefinitionArn' to be non-null");
    }

    private GetModelBiasJobDefinitionArgs() {
        this.jobDefinitionArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetModelBiasJobDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String jobDefinitionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetModelBiasJobDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobDefinitionArn = defaults.jobDefinitionArn;
        }

        public Builder setJobDefinitionArn(String jobDefinitionArn) {
            this.jobDefinitionArn = Objects.requireNonNull(jobDefinitionArn);
            return this;
        }
        public GetModelBiasJobDefinitionArgs build() {
            return new GetModelBiasJobDefinitionArgs(jobDefinitionArn);
        }
    }
}
