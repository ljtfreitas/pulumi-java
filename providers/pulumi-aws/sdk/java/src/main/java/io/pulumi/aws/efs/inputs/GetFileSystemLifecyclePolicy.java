// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.efs.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetFileSystemLifecyclePolicy extends io.pulumi.resources.InvokeArgs {

    public static final GetFileSystemLifecyclePolicy Empty = new GetFileSystemLifecyclePolicy();

    @InputImport(name="transitionToIa", required=true)
    private final String transitionToIa;

    public String getTransitionToIa() {
        return this.transitionToIa;
    }

    @InputImport(name="transitionToPrimaryStorageClass", required=true)
    private final String transitionToPrimaryStorageClass;

    public String getTransitionToPrimaryStorageClass() {
        return this.transitionToPrimaryStorageClass;
    }

    public GetFileSystemLifecyclePolicy(
        String transitionToIa,
        String transitionToPrimaryStorageClass) {
        this.transitionToIa = Objects.requireNonNull(transitionToIa, "expected parameter 'transitionToIa' to be non-null");
        this.transitionToPrimaryStorageClass = Objects.requireNonNull(transitionToPrimaryStorageClass, "expected parameter 'transitionToPrimaryStorageClass' to be non-null");
    }

    private GetFileSystemLifecyclePolicy() {
        this.transitionToIa = null;
        this.transitionToPrimaryStorageClass = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFileSystemLifecyclePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String transitionToIa;
        private String transitionToPrimaryStorageClass;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFileSystemLifecyclePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.transitionToIa = defaults.transitionToIa;
    	      this.transitionToPrimaryStorageClass = defaults.transitionToPrimaryStorageClass;
        }

        public Builder setTransitionToIa(String transitionToIa) {
            this.transitionToIa = Objects.requireNonNull(transitionToIa);
            return this;
        }

        public Builder setTransitionToPrimaryStorageClass(String transitionToPrimaryStorageClass) {
            this.transitionToPrimaryStorageClass = Objects.requireNonNull(transitionToPrimaryStorageClass);
            return this;
        }
        public GetFileSystemLifecyclePolicy build() {
            return new GetFileSystemLifecyclePolicy(transitionToIa, transitionToPrimaryStorageClass);
        }
    }
}