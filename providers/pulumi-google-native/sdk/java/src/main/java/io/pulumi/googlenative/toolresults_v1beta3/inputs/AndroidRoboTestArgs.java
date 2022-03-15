// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A test of an android application that explores the application on a virtual or physical Android device, finding culprits and crashes as it goes.
 * 
 */
public final class AndroidRoboTestArgs extends io.pulumi.resources.ResourceArgs {

    public static final AndroidRoboTestArgs Empty = new AndroidRoboTestArgs();

    /**
     * The initial activity that should be used to start the app. Optional
     * 
     */
    @Import(name="appInitialActivity")
      private final @Nullable Output<String> appInitialActivity;

    public Output<String> getAppInitialActivity() {
        return this.appInitialActivity == null ? Output.empty() : this.appInitialActivity;
    }

    /**
     * The java package for the bootstrap. Optional
     * 
     */
    @Import(name="bootstrapPackageId")
      private final @Nullable Output<String> bootstrapPackageId;

    public Output<String> getBootstrapPackageId() {
        return this.bootstrapPackageId == null ? Output.empty() : this.bootstrapPackageId;
    }

    /**
     * The runner class for the bootstrap. Optional
     * 
     */
    @Import(name="bootstrapRunnerClass")
      private final @Nullable Output<String> bootstrapRunnerClass;

    public Output<String> getBootstrapRunnerClass() {
        return this.bootstrapRunnerClass == null ? Output.empty() : this.bootstrapRunnerClass;
    }

    /**
     * The max depth of the traversal stack Robo can explore. Optional
     * 
     */
    @Import(name="maxDepth")
      private final @Nullable Output<Integer> maxDepth;

    public Output<Integer> getMaxDepth() {
        return this.maxDepth == null ? Output.empty() : this.maxDepth;
    }

    /**
     * The max number of steps/actions Robo can execute. Default is no limit (0). Optional
     * 
     */
    @Import(name="maxSteps")
      private final @Nullable Output<Integer> maxSteps;

    public Output<Integer> getMaxSteps() {
        return this.maxSteps == null ? Output.empty() : this.maxSteps;
    }

    public AndroidRoboTestArgs(
        @Nullable Output<String> appInitialActivity,
        @Nullable Output<String> bootstrapPackageId,
        @Nullable Output<String> bootstrapRunnerClass,
        @Nullable Output<Integer> maxDepth,
        @Nullable Output<Integer> maxSteps) {
        this.appInitialActivity = appInitialActivity;
        this.bootstrapPackageId = bootstrapPackageId;
        this.bootstrapRunnerClass = bootstrapRunnerClass;
        this.maxDepth = maxDepth;
        this.maxSteps = maxSteps;
    }

    private AndroidRoboTestArgs() {
        this.appInitialActivity = Output.empty();
        this.bootstrapPackageId = Output.empty();
        this.bootstrapRunnerClass = Output.empty();
        this.maxDepth = Output.empty();
        this.maxSteps = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AndroidRoboTestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> appInitialActivity;
        private @Nullable Output<String> bootstrapPackageId;
        private @Nullable Output<String> bootstrapRunnerClass;
        private @Nullable Output<Integer> maxDepth;
        private @Nullable Output<Integer> maxSteps;

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

        public Builder appInitialActivity(@Nullable Output<String> appInitialActivity) {
            this.appInitialActivity = appInitialActivity;
            return this;
        }

        public Builder appInitialActivity(@Nullable String appInitialActivity) {
            this.appInitialActivity = Output.ofNullable(appInitialActivity);
            return this;
        }

        public Builder bootstrapPackageId(@Nullable Output<String> bootstrapPackageId) {
            this.bootstrapPackageId = bootstrapPackageId;
            return this;
        }

        public Builder bootstrapPackageId(@Nullable String bootstrapPackageId) {
            this.bootstrapPackageId = Output.ofNullable(bootstrapPackageId);
            return this;
        }

        public Builder bootstrapRunnerClass(@Nullable Output<String> bootstrapRunnerClass) {
            this.bootstrapRunnerClass = bootstrapRunnerClass;
            return this;
        }

        public Builder bootstrapRunnerClass(@Nullable String bootstrapRunnerClass) {
            this.bootstrapRunnerClass = Output.ofNullable(bootstrapRunnerClass);
            return this;
        }

        public Builder maxDepth(@Nullable Output<Integer> maxDepth) {
            this.maxDepth = maxDepth;
            return this;
        }

        public Builder maxDepth(@Nullable Integer maxDepth) {
            this.maxDepth = Output.ofNullable(maxDepth);
            return this;
        }

        public Builder maxSteps(@Nullable Output<Integer> maxSteps) {
            this.maxSteps = maxSteps;
            return this;
        }

        public Builder maxSteps(@Nullable Integer maxSteps) {
            this.maxSteps = Output.ofNullable(maxSteps);
            return this;
        }
        public AndroidRoboTestArgs build() {
            return new AndroidRoboTestArgs(appInitialActivity, bootstrapPackageId, bootstrapRunnerClass, maxDepth, maxSteps);
        }
    }
}
