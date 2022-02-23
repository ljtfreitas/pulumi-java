// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.batch_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * UncountedTerminatedPods holds UIDs of Pods that have terminated but haven't been accounted in Job status counters.
 * 
 */
public final class UncountedTerminatedPodsArgs extends io.pulumi.resources.ResourceArgs {

    public static final UncountedTerminatedPodsArgs Empty = new UncountedTerminatedPodsArgs();

    /**
     * Failed holds UIDs of failed Pods.
     * 
     */
    @InputImport(name="failed")
        private final @Nullable Input<List<String>> failed;

    public Input<List<String>> getFailed() {
        return this.failed == null ? Input.empty() : this.failed;
    }

    /**
     * Succeeded holds UIDs of succeeded Pods.
     * 
     */
    @InputImport(name="succeeded")
        private final @Nullable Input<List<String>> succeeded;

    public Input<List<String>> getSucceeded() {
        return this.succeeded == null ? Input.empty() : this.succeeded;
    }

    public UncountedTerminatedPodsArgs(
        @Nullable Input<List<String>> failed,
        @Nullable Input<List<String>> succeeded) {
        this.failed = failed;
        this.succeeded = succeeded;
    }

    private UncountedTerminatedPodsArgs() {
        this.failed = Input.empty();
        this.succeeded = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UncountedTerminatedPodsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> failed;
        private @Nullable Input<List<String>> succeeded;

        public Builder() {
    	      // Empty
        }

        public Builder(UncountedTerminatedPodsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failed = defaults.failed;
    	      this.succeeded = defaults.succeeded;
        }

        public Builder setFailed(@Nullable Input<List<String>> failed) {
            this.failed = failed;
            return this;
        }

        public Builder setFailed(@Nullable List<String> failed) {
            this.failed = Input.ofNullable(failed);
            return this;
        }

        public Builder setSucceeded(@Nullable Input<List<String>> succeeded) {
            this.succeeded = succeeded;
            return this;
        }

        public Builder setSucceeded(@Nullable List<String> succeeded) {
            this.succeeded = Input.ofNullable(succeeded);
            return this;
        }
        public UncountedTerminatedPodsArgs build() {
            return new UncountedTerminatedPodsArgs(failed, succeeded);
        }
    }
}
