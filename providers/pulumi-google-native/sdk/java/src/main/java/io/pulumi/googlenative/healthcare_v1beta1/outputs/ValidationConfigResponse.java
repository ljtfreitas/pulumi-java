// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ValidationConfigResponse {
    /**
     * Whether to disable FHIRPath validation for incoming resources. Set this to true to disable checking incoming resources for conformance against FHIRPath requirement defined in the FHIR specification. This property only affects resource types that do not have profiles configured for them, any rules in enabled implementation guides will still be enforced.
     * 
     */
    private final Boolean disableFhirpathValidation;
    /**
     * Whether to disable profile validation for this FHIR store. Set this to true to disable checking incoming resources for conformance against StructureDefinitions in this FHIR store.
     * 
     */
    private final Boolean disableProfileValidation;
    /**
     * Whether to disable reference type validation for incoming resources. Set this to true to disable checking incoming resources for conformance against reference type requirement defined in the FHIR specification. This property only affects resource types that do not have profiles configured for them, any rules in enabled implementation guides will still be enforced.
     * 
     */
    private final Boolean disableReferenceTypeValidation;
    /**
     * Whether to disable required fields validation for incoming resources. Set this to true to disable checking incoming resources for conformance against required fields requirement defined in the FHIR specification. This property only affects resource types that do not have profiles configured for them, any rules in enabled implementation guides will still be enforced.
     * 
     */
    private final Boolean disableRequiredFieldValidation;
    /**
     * A list of ImplementationGuide URLs in this FHIR store that are used to configure the profiles to use for validation. For example, to use the US Core profiles for validation, set `enabled_implementation_guides` to `["http://hl7.org/fhir/us/core/ImplementationGuide/ig"]`. If `enabled_implementation_guides` is empty or omitted, then incoming resources are only required to conform to the base FHIR profiles. Otherwise, a resource must conform to at least one profile listed in the `global` property of one of the enabled ImplementationGuides. The Cloud Healthcare API does not currently enforce all of the rules in a StructureDefinition. The following rules are supported: - min/max - minValue/maxValue - maxLength - type - fixed[x] - pattern[x] on simple types - slicing, when using "value" as the discriminator type When a URL cannot be resolved (for example, in a type assertion), the server does not return an error.
     * 
     */
    private final List<String> enabledImplementationGuides;

    @OutputCustomType.Constructor({"disableFhirpathValidation","disableProfileValidation","disableReferenceTypeValidation","disableRequiredFieldValidation","enabledImplementationGuides"})
    private ValidationConfigResponse(
        Boolean disableFhirpathValidation,
        Boolean disableProfileValidation,
        Boolean disableReferenceTypeValidation,
        Boolean disableRequiredFieldValidation,
        List<String> enabledImplementationGuides) {
        this.disableFhirpathValidation = Objects.requireNonNull(disableFhirpathValidation);
        this.disableProfileValidation = Objects.requireNonNull(disableProfileValidation);
        this.disableReferenceTypeValidation = Objects.requireNonNull(disableReferenceTypeValidation);
        this.disableRequiredFieldValidation = Objects.requireNonNull(disableRequiredFieldValidation);
        this.enabledImplementationGuides = Objects.requireNonNull(enabledImplementationGuides);
    }

    /**
     * Whether to disable FHIRPath validation for incoming resources. Set this to true to disable checking incoming resources for conformance against FHIRPath requirement defined in the FHIR specification. This property only affects resource types that do not have profiles configured for them, any rules in enabled implementation guides will still be enforced.
     * 
     */
    public Boolean getDisableFhirpathValidation() {
        return this.disableFhirpathValidation;
    }
    /**
     * Whether to disable profile validation for this FHIR store. Set this to true to disable checking incoming resources for conformance against StructureDefinitions in this FHIR store.
     * 
     */
    public Boolean getDisableProfileValidation() {
        return this.disableProfileValidation;
    }
    /**
     * Whether to disable reference type validation for incoming resources. Set this to true to disable checking incoming resources for conformance against reference type requirement defined in the FHIR specification. This property only affects resource types that do not have profiles configured for them, any rules in enabled implementation guides will still be enforced.
     * 
     */
    public Boolean getDisableReferenceTypeValidation() {
        return this.disableReferenceTypeValidation;
    }
    /**
     * Whether to disable required fields validation for incoming resources. Set this to true to disable checking incoming resources for conformance against required fields requirement defined in the FHIR specification. This property only affects resource types that do not have profiles configured for them, any rules in enabled implementation guides will still be enforced.
     * 
     */
    public Boolean getDisableRequiredFieldValidation() {
        return this.disableRequiredFieldValidation;
    }
    /**
     * A list of ImplementationGuide URLs in this FHIR store that are used to configure the profiles to use for validation. For example, to use the US Core profiles for validation, set `enabled_implementation_guides` to `["http://hl7.org/fhir/us/core/ImplementationGuide/ig"]`. If `enabled_implementation_guides` is empty or omitted, then incoming resources are only required to conform to the base FHIR profiles. Otherwise, a resource must conform to at least one profile listed in the `global` property of one of the enabled ImplementationGuides. The Cloud Healthcare API does not currently enforce all of the rules in a StructureDefinition. The following rules are supported: - min/max - minValue/maxValue - maxLength - type - fixed[x] - pattern[x] on simple types - slicing, when using "value" as the discriminator type When a URL cannot be resolved (for example, in a type assertion), the server does not return an error.
     * 
     */
    public List<String> getEnabledImplementationGuides() {
        return this.enabledImplementationGuides;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disableFhirpathValidation;
        private Boolean disableProfileValidation;
        private Boolean disableReferenceTypeValidation;
        private Boolean disableRequiredFieldValidation;
        private List<String> enabledImplementationGuides;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableFhirpathValidation = defaults.disableFhirpathValidation;
    	      this.disableProfileValidation = defaults.disableProfileValidation;
    	      this.disableReferenceTypeValidation = defaults.disableReferenceTypeValidation;
    	      this.disableRequiredFieldValidation = defaults.disableRequiredFieldValidation;
    	      this.enabledImplementationGuides = defaults.enabledImplementationGuides;
        }

        public Builder setDisableFhirpathValidation(Boolean disableFhirpathValidation) {
            this.disableFhirpathValidation = Objects.requireNonNull(disableFhirpathValidation);
            return this;
        }

        public Builder setDisableProfileValidation(Boolean disableProfileValidation) {
            this.disableProfileValidation = Objects.requireNonNull(disableProfileValidation);
            return this;
        }

        public Builder setDisableReferenceTypeValidation(Boolean disableReferenceTypeValidation) {
            this.disableReferenceTypeValidation = Objects.requireNonNull(disableReferenceTypeValidation);
            return this;
        }

        public Builder setDisableRequiredFieldValidation(Boolean disableRequiredFieldValidation) {
            this.disableRequiredFieldValidation = Objects.requireNonNull(disableRequiredFieldValidation);
            return this;
        }

        public Builder setEnabledImplementationGuides(List<String> enabledImplementationGuides) {
            this.enabledImplementationGuides = Objects.requireNonNull(enabledImplementationGuides);
            return this;
        }
        public ValidationConfigResponse build() {
            return new ValidationConfigResponse(disableFhirpathValidation, disableProfileValidation, disableReferenceTypeValidation, disableRequiredFieldValidation, enabledImplementationGuides);
        }
    }
}
