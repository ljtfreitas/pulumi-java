// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.batch_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class UncountedTerminatedPods {
    /**
     * Failed holds UIDs of failed Pods.
     * 
     */
    private final @Nullable List<String> failed;
    /**
     * Succeeded holds UIDs of succeeded Pods.
     * 
     */
    private final @Nullable List<String> succeeded;

    @CustomType.Constructor
    private UncountedTerminatedPods(
        @CustomType.Parameter("failed") @Nullable List<String> failed,
        @CustomType.Parameter("succeeded") @Nullable List<String> succeeded) {
        this.failed = failed;
        this.succeeded = succeeded;
    }

    /**
     * Failed holds UIDs of failed Pods.
     * 
    */
    public List<String> getFailed() {
        return this.failed == null ? List.of() : this.failed;
    }
    /**
     * Succeeded holds UIDs of succeeded Pods.
     * 
    */
    public List<String> getSucceeded() {
        return this.succeeded == null ? List.of() : this.succeeded;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UncountedTerminatedPods defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> failed;
        private @Nullable List<String> succeeded;

        public Builder() {
    	      // Empty
        }

        public Builder(UncountedTerminatedPods defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failed = defaults.failed;
    	      this.succeeded = defaults.succeeded;
        }

        public Builder failed(@Nullable List<String> failed) {
            this.failed = failed;
            return this;
        }

        public Builder succeeded(@Nullable List<String> succeeded) {
            this.succeeded = succeeded;
            return this;
        }
        public UncountedTerminatedPods build() {
            return new UncountedTerminatedPods(failed, succeeded);
        }
    }
}
