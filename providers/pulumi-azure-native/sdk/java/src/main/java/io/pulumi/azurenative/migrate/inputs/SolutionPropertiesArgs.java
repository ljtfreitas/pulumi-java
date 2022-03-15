// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.azurenative.migrate.inputs.SolutionDetailsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Class for solution properties.
 * 
 */
public final class SolutionPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final SolutionPropertiesArgs Empty = new SolutionPropertiesArgs();

    /**
     * Gets or sets the cleanup state of the solution.
     * 
     */
    @Import(name="cleanupState")
      private final @Nullable Output<String> cleanupState;

    public Output<String> getCleanupState() {
        return this.cleanupState == null ? Output.empty() : this.cleanupState;
    }

    /**
     * Gets or sets the details of the solution.
     * 
     */
    @Import(name="details")
      private final @Nullable Output<SolutionDetailsArgs> details;

    public Output<SolutionDetailsArgs> getDetails() {
        return this.details == null ? Output.empty() : this.details;
    }

    /**
     * Gets or sets the goal of the solution.
     * 
     */
    @Import(name="goal")
      private final @Nullable Output<String> goal;

    public Output<String> getGoal() {
        return this.goal == null ? Output.empty() : this.goal;
    }

    /**
     * Gets or sets the purpose of the solution.
     * 
     */
    @Import(name="purpose")
      private final @Nullable Output<String> purpose;

    public Output<String> getPurpose() {
        return this.purpose == null ? Output.empty() : this.purpose;
    }

    /**
     * Gets or sets the current status of the solution.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    /**
     * Gets or sets the tool being used in the solution.
     * 
     */
    @Import(name="tool")
      private final @Nullable Output<String> tool;

    public Output<String> getTool() {
        return this.tool == null ? Output.empty() : this.tool;
    }

    public SolutionPropertiesArgs(
        @Nullable Output<String> cleanupState,
        @Nullable Output<SolutionDetailsArgs> details,
        @Nullable Output<String> goal,
        @Nullable Output<String> purpose,
        @Nullable Output<String> status,
        @Nullable Output<String> tool) {
        this.cleanupState = cleanupState;
        this.details = details;
        this.goal = goal;
        this.purpose = purpose;
        this.status = status;
        this.tool = tool;
    }

    private SolutionPropertiesArgs() {
        this.cleanupState = Output.empty();
        this.details = Output.empty();
        this.goal = Output.empty();
        this.purpose = Output.empty();
        this.status = Output.empty();
        this.tool = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SolutionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cleanupState;
        private @Nullable Output<SolutionDetailsArgs> details;
        private @Nullable Output<String> goal;
        private @Nullable Output<String> purpose;
        private @Nullable Output<String> status;
        private @Nullable Output<String> tool;

        public Builder() {
    	      // Empty
        }

        public Builder(SolutionPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cleanupState = defaults.cleanupState;
    	      this.details = defaults.details;
    	      this.goal = defaults.goal;
    	      this.purpose = defaults.purpose;
    	      this.status = defaults.status;
    	      this.tool = defaults.tool;
        }

        public Builder cleanupState(@Nullable Output<String> cleanupState) {
            this.cleanupState = cleanupState;
            return this;
        }

        public Builder cleanupState(@Nullable String cleanupState) {
            this.cleanupState = Output.ofNullable(cleanupState);
            return this;
        }

        public Builder details(@Nullable Output<SolutionDetailsArgs> details) {
            this.details = details;
            return this;
        }

        public Builder details(@Nullable SolutionDetailsArgs details) {
            this.details = Output.ofNullable(details);
            return this;
        }

        public Builder goal(@Nullable Output<String> goal) {
            this.goal = goal;
            return this;
        }

        public Builder goal(@Nullable String goal) {
            this.goal = Output.ofNullable(goal);
            return this;
        }

        public Builder purpose(@Nullable Output<String> purpose) {
            this.purpose = purpose;
            return this;
        }

        public Builder purpose(@Nullable String purpose) {
            this.purpose = Output.ofNullable(purpose);
            return this;
        }

        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
            return this;
        }

        public Builder tool(@Nullable Output<String> tool) {
            this.tool = tool;
            return this;
        }

        public Builder tool(@Nullable String tool) {
            this.tool = Output.ofNullable(tool);
            return this;
        }
        public SolutionPropertiesArgs build() {
            return new SolutionPropertiesArgs(cleanupState, details, goal, purpose, status, tool);
        }
    }
}
