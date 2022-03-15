// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGcsObjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGcsObjectArgs Empty = new PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGcsObjectArgs();

    /**
     * Bucket of the Cloud Storage object.
     * 
     */
    @Import(name="bucket", required=true)
      private final Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket;
    }

    /**
     * Generation number of the Cloud Storage object. This is used to ensure that the ExecStep specified by this PatchJob does not change.
     * 
     */
    @Import(name="generationNumber", required=true)
      private final Output<String> generationNumber;

    public Output<String> getGenerationNumber() {
        return this.generationNumber;
    }

    /**
     * Name of the Cloud Storage object.
     * 
     */
    @Import(name="object", required=true)
      private final Output<String> object;

    public Output<String> getObject() {
        return this.object;
    }

    public PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGcsObjectArgs(
        Output<String> bucket,
        Output<String> generationNumber,
        Output<String> object) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.generationNumber = Objects.requireNonNull(generationNumber, "expected parameter 'generationNumber' to be non-null");
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
    }

    private PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGcsObjectArgs() {
        this.bucket = Output.empty();
        this.generationNumber = Output.empty();
        this.object = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGcsObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucket;
        private Output<String> generationNumber;
        private Output<String> object;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGcsObjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.generationNumber = defaults.generationNumber;
    	      this.object = defaults.object;
        }

        public Builder bucket(Output<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder bucket(String bucket) {
            this.bucket = Output.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder generationNumber(Output<String> generationNumber) {
            this.generationNumber = Objects.requireNonNull(generationNumber);
            return this;
        }

        public Builder generationNumber(String generationNumber) {
            this.generationNumber = Output.of(Objects.requireNonNull(generationNumber));
            return this;
        }

        public Builder object(Output<String> object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }

        public Builder object(String object) {
            this.object = Output.of(Objects.requireNonNull(object));
            return this;
        }
        public PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGcsObjectArgs build() {
            return new PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGcsObjectArgs(bucket, generationNumber, object);
        }
    }
}
