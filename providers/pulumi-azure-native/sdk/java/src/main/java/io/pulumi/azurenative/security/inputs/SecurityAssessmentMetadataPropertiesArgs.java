// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.azurenative.security.enums.AssessmentType;
import io.pulumi.azurenative.security.enums.Categories;
import io.pulumi.azurenative.security.enums.ImplementationEffort;
import io.pulumi.azurenative.security.enums.Severity;
import io.pulumi.azurenative.security.enums.Threats;
import io.pulumi.azurenative.security.enums.UserImpact;
import io.pulumi.azurenative.security.inputs.SecurityAssessmentMetadataPartnerDataArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes properties of an assessment metadata.
 * 
 */
public final class SecurityAssessmentMetadataPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityAssessmentMetadataPropertiesArgs Empty = new SecurityAssessmentMetadataPropertiesArgs();

    /**
     * BuiltIn if the assessment based on built-in Azure Policy definition, Custom if the assessment based on custom Azure Policy definition
     * 
     */
    @Import(name="assessmentType", required=true)
      private final Output<Either<String,AssessmentType>> assessmentType;

    public Output<Either<String,AssessmentType>> getAssessmentType() {
        return this.assessmentType;
    }

    @Import(name="categories")
      private final @Nullable Output<List<Either<String,Categories>>> categories;

    public Output<List<Either<String,Categories>>> getCategories() {
        return this.categories == null ? Output.empty() : this.categories;
    }

    /**
     * Human readable description of the assessment
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * User friendly display name of the assessment
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * The implementation effort required to remediate this assessment
     * 
     */
    @Import(name="implementationEffort")
      private final @Nullable Output<Either<String,ImplementationEffort>> implementationEffort;

    public Output<Either<String,ImplementationEffort>> getImplementationEffort() {
        return this.implementationEffort == null ? Output.empty() : this.implementationEffort;
    }

    /**
     * Describes the partner that created the assessment
     * 
     */
    @Import(name="partnerData")
      private final @Nullable Output<SecurityAssessmentMetadataPartnerDataArgs> partnerData;

    public Output<SecurityAssessmentMetadataPartnerDataArgs> getPartnerData() {
        return this.partnerData == null ? Output.empty() : this.partnerData;
    }

    /**
     * True if this assessment is in preview release status
     * 
     */
    @Import(name="preview")
      private final @Nullable Output<Boolean> preview;

    public Output<Boolean> getPreview() {
        return this.preview == null ? Output.empty() : this.preview;
    }

    /**
     * Human readable description of what you should do to mitigate this security issue
     * 
     */
    @Import(name="remediationDescription")
      private final @Nullable Output<String> remediationDescription;

    public Output<String> getRemediationDescription() {
        return this.remediationDescription == null ? Output.empty() : this.remediationDescription;
    }

    /**
     * The severity level of the assessment
     * 
     */
    @Import(name="severity", required=true)
      private final Output<Either<String,Severity>> severity;

    public Output<Either<String,Severity>> getSeverity() {
        return this.severity;
    }

    @Import(name="threats")
      private final @Nullable Output<List<Either<String,Threats>>> threats;

    public Output<List<Either<String,Threats>>> getThreats() {
        return this.threats == null ? Output.empty() : this.threats;
    }

    /**
     * The user impact of the assessment
     * 
     */
    @Import(name="userImpact")
      private final @Nullable Output<Either<String,UserImpact>> userImpact;

    public Output<Either<String,UserImpact>> getUserImpact() {
        return this.userImpact == null ? Output.empty() : this.userImpact;
    }

    public SecurityAssessmentMetadataPropertiesArgs(
        Output<Either<String,AssessmentType>> assessmentType,
        @Nullable Output<List<Either<String,Categories>>> categories,
        @Nullable Output<String> description,
        Output<String> displayName,
        @Nullable Output<Either<String,ImplementationEffort>> implementationEffort,
        @Nullable Output<SecurityAssessmentMetadataPartnerDataArgs> partnerData,
        @Nullable Output<Boolean> preview,
        @Nullable Output<String> remediationDescription,
        Output<Either<String,Severity>> severity,
        @Nullable Output<List<Either<String,Threats>>> threats,
        @Nullable Output<Either<String,UserImpact>> userImpact) {
        this.assessmentType = Objects.requireNonNull(assessmentType, "expected parameter 'assessmentType' to be non-null");
        this.categories = categories;
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.implementationEffort = implementationEffort;
        this.partnerData = partnerData;
        this.preview = preview;
        this.remediationDescription = remediationDescription;
        this.severity = Objects.requireNonNull(severity, "expected parameter 'severity' to be non-null");
        this.threats = threats;
        this.userImpact = userImpact;
    }

    private SecurityAssessmentMetadataPropertiesArgs() {
        this.assessmentType = Output.empty();
        this.categories = Output.empty();
        this.description = Output.empty();
        this.displayName = Output.empty();
        this.implementationEffort = Output.empty();
        this.partnerData = Output.empty();
        this.preview = Output.empty();
        this.remediationDescription = Output.empty();
        this.severity = Output.empty();
        this.threats = Output.empty();
        this.userImpact = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityAssessmentMetadataPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,AssessmentType>> assessmentType;
        private @Nullable Output<List<Either<String,Categories>>> categories;
        private @Nullable Output<String> description;
        private Output<String> displayName;
        private @Nullable Output<Either<String,ImplementationEffort>> implementationEffort;
        private @Nullable Output<SecurityAssessmentMetadataPartnerDataArgs> partnerData;
        private @Nullable Output<Boolean> preview;
        private @Nullable Output<String> remediationDescription;
        private Output<Either<String,Severity>> severity;
        private @Nullable Output<List<Either<String,Threats>>> threats;
        private @Nullable Output<Either<String,UserImpact>> userImpact;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityAssessmentMetadataPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assessmentType = defaults.assessmentType;
    	      this.categories = defaults.categories;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.implementationEffort = defaults.implementationEffort;
    	      this.partnerData = defaults.partnerData;
    	      this.preview = defaults.preview;
    	      this.remediationDescription = defaults.remediationDescription;
    	      this.severity = defaults.severity;
    	      this.threats = defaults.threats;
    	      this.userImpact = defaults.userImpact;
        }

        public Builder assessmentType(Output<Either<String,AssessmentType>> assessmentType) {
            this.assessmentType = Objects.requireNonNull(assessmentType);
            return this;
        }

        public Builder assessmentType(Either<String,AssessmentType> assessmentType) {
            this.assessmentType = Output.of(Objects.requireNonNull(assessmentType));
            return this;
        }

        public Builder categories(@Nullable Output<List<Either<String,Categories>>> categories) {
            this.categories = categories;
            return this;
        }

        public Builder categories(@Nullable List<Either<String,Categories>> categories) {
            this.categories = Output.ofNullable(categories);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder implementationEffort(@Nullable Output<Either<String,ImplementationEffort>> implementationEffort) {
            this.implementationEffort = implementationEffort;
            return this;
        }

        public Builder implementationEffort(@Nullable Either<String,ImplementationEffort> implementationEffort) {
            this.implementationEffort = Output.ofNullable(implementationEffort);
            return this;
        }

        public Builder partnerData(@Nullable Output<SecurityAssessmentMetadataPartnerDataArgs> partnerData) {
            this.partnerData = partnerData;
            return this;
        }

        public Builder partnerData(@Nullable SecurityAssessmentMetadataPartnerDataArgs partnerData) {
            this.partnerData = Output.ofNullable(partnerData);
            return this;
        }

        public Builder preview(@Nullable Output<Boolean> preview) {
            this.preview = preview;
            return this;
        }

        public Builder preview(@Nullable Boolean preview) {
            this.preview = Output.ofNullable(preview);
            return this;
        }

        public Builder remediationDescription(@Nullable Output<String> remediationDescription) {
            this.remediationDescription = remediationDescription;
            return this;
        }

        public Builder remediationDescription(@Nullable String remediationDescription) {
            this.remediationDescription = Output.ofNullable(remediationDescription);
            return this;
        }

        public Builder severity(Output<Either<String,Severity>> severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }

        public Builder severity(Either<String,Severity> severity) {
            this.severity = Output.of(Objects.requireNonNull(severity));
            return this;
        }

        public Builder threats(@Nullable Output<List<Either<String,Threats>>> threats) {
            this.threats = threats;
            return this;
        }

        public Builder threats(@Nullable List<Either<String,Threats>> threats) {
            this.threats = Output.ofNullable(threats);
            return this;
        }

        public Builder userImpact(@Nullable Output<Either<String,UserImpact>> userImpact) {
            this.userImpact = userImpact;
            return this;
        }

        public Builder userImpact(@Nullable Either<String,UserImpact> userImpact) {
            this.userImpact = Output.ofNullable(userImpact);
            return this;
        }
        public SecurityAssessmentMetadataPropertiesArgs build() {
            return new SecurityAssessmentMetadataPropertiesArgs(assessmentType, categories, description, displayName, implementationEffort, partnerData, preview, remediationDescription, severity, threats, userImpact);
        }
    }
}
