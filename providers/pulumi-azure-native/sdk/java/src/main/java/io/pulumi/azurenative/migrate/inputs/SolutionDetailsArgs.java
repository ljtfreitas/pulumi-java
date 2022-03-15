// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Class representing the details of the solution.
 * 
 */
public final class SolutionDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SolutionDetailsArgs Empty = new SolutionDetailsArgs();

    /**
     * Gets or sets the count of assessments reported by the solution.
     * 
     */
    @Import(name="assessmentCount")
      private final @Nullable Output<Integer> assessmentCount;

    public Output<Integer> getAssessmentCount() {
        return this.assessmentCount == null ? Output.empty() : this.assessmentCount;
    }

    /**
     * Gets or sets the extended details reported by the solution.
     * 
     */
    @Import(name="extendedDetails")
      private final @Nullable Output<Map<String,String>> extendedDetails;

    public Output<Map<String,String>> getExtendedDetails() {
        return this.extendedDetails == null ? Output.empty() : this.extendedDetails;
    }

    /**
     * Gets or sets the count of groups reported by the solution.
     * 
     */
    @Import(name="groupCount")
      private final @Nullable Output<Integer> groupCount;

    public Output<Integer> getGroupCount() {
        return this.groupCount == null ? Output.empty() : this.groupCount;
    }

    public SolutionDetailsArgs(
        @Nullable Output<Integer> assessmentCount,
        @Nullable Output<Map<String,String>> extendedDetails,
        @Nullable Output<Integer> groupCount) {
        this.assessmentCount = assessmentCount;
        this.extendedDetails = extendedDetails;
        this.groupCount = groupCount;
    }

    private SolutionDetailsArgs() {
        this.assessmentCount = Output.empty();
        this.extendedDetails = Output.empty();
        this.groupCount = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SolutionDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> assessmentCount;
        private @Nullable Output<Map<String,String>> extendedDetails;
        private @Nullable Output<Integer> groupCount;

        public Builder() {
    	      // Empty
        }

        public Builder(SolutionDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assessmentCount = defaults.assessmentCount;
    	      this.extendedDetails = defaults.extendedDetails;
    	      this.groupCount = defaults.groupCount;
        }

        public Builder assessmentCount(@Nullable Output<Integer> assessmentCount) {
            this.assessmentCount = assessmentCount;
            return this;
        }

        public Builder assessmentCount(@Nullable Integer assessmentCount) {
            this.assessmentCount = Output.ofNullable(assessmentCount);
            return this;
        }

        public Builder extendedDetails(@Nullable Output<Map<String,String>> extendedDetails) {
            this.extendedDetails = extendedDetails;
            return this;
        }

        public Builder extendedDetails(@Nullable Map<String,String> extendedDetails) {
            this.extendedDetails = Output.ofNullable(extendedDetails);
            return this;
        }

        public Builder groupCount(@Nullable Output<Integer> groupCount) {
            this.groupCount = groupCount;
            return this;
        }

        public Builder groupCount(@Nullable Integer groupCount) {
            this.groupCount = Output.ofNullable(groupCount);
            return this;
        }
        public SolutionDetailsArgs build() {
            return new SolutionDetailsArgs(assessmentCount, extendedDetails, groupCount);
        }
    }
}
