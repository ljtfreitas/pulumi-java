// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AndroidRoboTestArgs extends io.pulumi.resources.ResourceArgs {

    public static final AndroidRoboTestArgs Empty = new AndroidRoboTestArgs();

    @InputImport(name="appInitialActivity")
    private final @Nullable Input<String> appInitialActivity;

    public Input<String> getAppInitialActivity() {
        return this.appInitialActivity == null ? Input.empty() : this.appInitialActivity;
    }

    @InputImport(name="bootstrapPackageId")
    private final @Nullable Input<String> bootstrapPackageId;

    public Input<String> getBootstrapPackageId() {
        return this.bootstrapPackageId == null ? Input.empty() : this.bootstrapPackageId;
    }

    @InputImport(name="bootstrapRunnerClass")
    private final @Nullable Input<String> bootstrapRunnerClass;

    public Input<String> getBootstrapRunnerClass() {
        return this.bootstrapRunnerClass == null ? Input.empty() : this.bootstrapRunnerClass;
    }

    @InputImport(name="maxDepth")
    private final @Nullable Input<Integer> maxDepth;

    public Input<Integer> getMaxDepth() {
        return this.maxDepth == null ? Input.empty() : this.maxDepth;
    }

    @InputImport(name="maxSteps")
    private final @Nullable Input<Integer> maxSteps;

    public Input<Integer> getMaxSteps() {
        return this.maxSteps == null ? Input.empty() : this.maxSteps;
    }

    public AndroidRoboTestArgs(
        @Nullable Input<String> appInitialActivity,
        @Nullable Input<String> bootstrapPackageId,
        @Nullable Input<String> bootstrapRunnerClass,
        @Nullable Input<Integer> maxDepth,
        @Nullable Input<Integer> maxSteps) {
        this.appInitialActivity = appInitialActivity;
        this.bootstrapPackageId = bootstrapPackageId;
        this.bootstrapRunnerClass = bootstrapRunnerClass;
        this.maxDepth = maxDepth;
        this.maxSteps = maxSteps;
    }

    private AndroidRoboTestArgs() {
        this.appInitialActivity = Input.empty();
        this.bootstrapPackageId = Input.empty();
        this.bootstrapRunnerClass = Input.empty();
        this.maxDepth = Input.empty();
        this.maxSteps = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AndroidRoboTestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> appInitialActivity;
        private @Nullable Input<String> bootstrapPackageId;
        private @Nullable Input<String> bootstrapRunnerClass;
        private @Nullable Input<Integer> maxDepth;
        private @Nullable Input<Integer> maxSteps;

        public Builder() {
    	      // Empty
        }

        public Builder(AndroidRoboTestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appInitialActivity = defaults.appInitialActivity;
    	      this.bootstrapPackageId = defaults.bootstrapPackageId;
    	      this.bootstrapRunnerClass = defaults.bootstrapRunnerClass;
    	      this.maxDepth = defaults.maxDepth;
    	      this.maxSteps = defaults.maxSteps;
        }

        public Builder setAppInitialActivity(@Nullable Input<String> appInitialActivity) {
            this.appInitialActivity = appInitialActivity;
            return this;
        }

        public Builder setAppInitialActivity(@Nullable String appInitialActivity) {
            this.appInitialActivity = Input.ofNullable(appInitialActivity);
            return this;
        }

        public Builder setBootstrapPackageId(@Nullable Input<String> bootstrapPackageId) {
            this.bootstrapPackageId = bootstrapPackageId;
            return this;
        }

        public Builder setBootstrapPackageId(@Nullable String bootstrapPackageId) {
            this.bootstrapPackageId = Input.ofNullable(bootstrapPackageId);
            return this;
        }

        public Builder setBootstrapRunnerClass(@Nullable Input<String> bootstrapRunnerClass) {
            this.bootstrapRunnerClass = bootstrapRunnerClass;
            return this;
        }

        public Builder setBootstrapRunnerClass(@Nullable String bootstrapRunnerClass) {
            this.bootstrapRunnerClass = Input.ofNullable(bootstrapRunnerClass);
            return this;
        }

        public Builder setMaxDepth(@Nullable Input<Integer> maxDepth) {
            this.maxDepth = maxDepth;
            return this;
        }

        public Builder setMaxDepth(@Nullable Integer maxDepth) {
            this.maxDepth = Input.ofNullable(maxDepth);
            return this;
        }

        public Builder setMaxSteps(@Nullable Input<Integer> maxSteps) {
            this.maxSteps = maxSteps;
            return this;
        }

        public Builder setMaxSteps(@Nullable Integer maxSteps) {
            this.maxSteps = Input.ofNullable(maxSteps);
            return this;
        }

        public AndroidRoboTestArgs build() {
            return new AndroidRoboTestArgs(appInitialActivity, bootstrapPackageId, bootstrapRunnerClass, maxDepth, maxSteps);
        }
    }
}