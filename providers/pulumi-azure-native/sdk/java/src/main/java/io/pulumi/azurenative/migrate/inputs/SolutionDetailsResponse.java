// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Class representing the details of the solution.
 * 
 */
public final class SolutionDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final SolutionDetailsResponse Empty = new SolutionDetailsResponse();

    /**
     * Gets or sets the count of assessments reported by the solution.
     * 
     */
    @InputImport(name="assessmentCount")
    private final @Nullable Integer assessmentCount;

    public Optional<Integer> getAssessmentCount() {
        return this.assessmentCount == null ? Optional.empty() : Optional.ofNullable(this.assessmentCount);
    }

    /**
     * Gets or sets the extended details reported by the solution.
     * 
     */
    @InputImport(name="extendedDetails")
    private final @Nullable Map<String,String> extendedDetails;

    public Map<String,String> getExtendedDetails() {
        return this.extendedDetails == null ? Map.of() : this.extendedDetails;
    }

    /**
     * Gets or sets the count of groups reported by the solution.
     * 
     */
    @InputImport(name="groupCount")
    private final @Nullable Integer groupCount;

    public Optional<Integer> getGroupCount() {
        return this.groupCount == null ? Optional.empty() : Optional.ofNullable(this.groupCount);
    }

    public SolutionDetailsResponse(
        @Nullable Integer assessmentCount,
        @Nullable Map<String,String> extendedDetails,
        @Nullable Integer groupCount) {
        this.assessmentCount = assessmentCount;
        this.extendedDetails = extendedDetails;
        this.groupCount = groupCount;
    }

    private SolutionDetailsResponse() {
        this.assessmentCount = null;
        this.extendedDetails = Map.of();
        this.groupCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SolutionDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer assessmentCount;
        private @Nullable Map<String,String> extendedDetails;
        private @Nullable Integer groupCount;

        public Builder() {
    	      // Empty
        }

        public Builder(SolutionDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assessmentCount = defaults.assessmentCount;
    	      this.extendedDetails = defaults.extendedDetails;
    	      this.groupCount = defaults.groupCount;
        }

        public Builder setAssessmentCount(@Nullable Integer assessmentCount) {
            this.assessmentCount = assessmentCount;
            return this;
        }

        public Builder setExtendedDetails(@Nullable Map<String,String> extendedDetails) {
            this.extendedDetails = extendedDetails;
            return this;
        }

        public Builder setGroupCount(@Nullable Integer groupCount) {
            this.groupCount = groupCount;
            return this;
        }

        public SolutionDetailsResponse build() {
            return new SolutionDetailsResponse(assessmentCount, extendedDetails, groupCount);
        }
    }
}
