// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.SecurityPolicyAdaptiveProtectionConfigResponse;
import io.pulumi.googlenative.compute_beta.outputs.SecurityPolicyAdvancedOptionsConfigResponse;
import io.pulumi.googlenative.compute_beta.outputs.SecurityPolicyAssociationResponse;
import io.pulumi.googlenative.compute_beta.outputs.SecurityPolicyRecaptchaOptionsConfigResponse;
import io.pulumi.googlenative.compute_beta.outputs.SecurityPolicyRuleResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetOrganizationSecurityPolicyResult {
    private final SecurityPolicyAdaptiveProtectionConfigResponse adaptiveProtectionConfig;
    private final SecurityPolicyAdvancedOptionsConfigResponse advancedOptionsConfig;
    private final List<SecurityPolicyAssociationResponse> associations;
    private final String creationTimestamp;
    private final String description;
    private final String displayName;
    private final String fingerprint;
    private final String kind;
    private final String labelFingerprint;
    private final Map<String,String> labels;
    private final String name;
    private final String parent;
    private final SecurityPolicyRecaptchaOptionsConfigResponse recaptchaOptionsConfig;
    private final Integer ruleTupleCount;
    private final List<SecurityPolicyRuleResponse> rules;
    private final String selfLink;
    private final String selfLinkWithId;
    private final String type;

    @OutputCustomType.Constructor({"adaptiveProtectionConfig","advancedOptionsConfig","associations","creationTimestamp","description","displayName","fingerprint","kind","labelFingerprint","labels","name","parent","recaptchaOptionsConfig","ruleTupleCount","rules","selfLink","selfLinkWithId","type"})
    private GetOrganizationSecurityPolicyResult(
        SecurityPolicyAdaptiveProtectionConfigResponse adaptiveProtectionConfig,
        SecurityPolicyAdvancedOptionsConfigResponse advancedOptionsConfig,
        List<SecurityPolicyAssociationResponse> associations,
        String creationTimestamp,
        String description,
        String displayName,
        String fingerprint,
        String kind,
        String labelFingerprint,
        Map<String,String> labels,
        String name,
        String parent,
        SecurityPolicyRecaptchaOptionsConfigResponse recaptchaOptionsConfig,
        Integer ruleTupleCount,
        List<SecurityPolicyRuleResponse> rules,
        String selfLink,
        String selfLinkWithId,
        String type) {
        this.adaptiveProtectionConfig = Objects.requireNonNull(adaptiveProtectionConfig);
        this.advancedOptionsConfig = Objects.requireNonNull(advancedOptionsConfig);
        this.associations = Objects.requireNonNull(associations);
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.description = Objects.requireNonNull(description);
        this.displayName = Objects.requireNonNull(displayName);
        this.fingerprint = Objects.requireNonNull(fingerprint);
        this.kind = Objects.requireNonNull(kind);
        this.labelFingerprint = Objects.requireNonNull(labelFingerprint);
        this.labels = Objects.requireNonNull(labels);
        this.name = Objects.requireNonNull(name);
        this.parent = Objects.requireNonNull(parent);
        this.recaptchaOptionsConfig = Objects.requireNonNull(recaptchaOptionsConfig);
        this.ruleTupleCount = Objects.requireNonNull(ruleTupleCount);
        this.rules = Objects.requireNonNull(rules);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
        this.type = Objects.requireNonNull(type);
    }

    public SecurityPolicyAdaptiveProtectionConfigResponse getAdaptiveProtectionConfig() {
        return this.adaptiveProtectionConfig;
    }
    public SecurityPolicyAdvancedOptionsConfigResponse getAdvancedOptionsConfig() {
        return this.advancedOptionsConfig;
    }
    public List<SecurityPolicyAssociationResponse> getAssociations() {
        return this.associations;
    }
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    public String getDescription() {
        return this.description;
    }
    public String getDisplayName() {
        return this.displayName;
    }
    public String getFingerprint() {
        return this.fingerprint;
    }
    public String getKind() {
        return this.kind;
    }
    public String getLabelFingerprint() {
        return this.labelFingerprint;
    }
    public Map<String,String> getLabels() {
        return this.labels;
    }
    public String getName() {
        return this.name;
    }
    public String getParent() {
        return this.parent;
    }
    public SecurityPolicyRecaptchaOptionsConfigResponse getRecaptchaOptionsConfig() {
        return this.recaptchaOptionsConfig;
    }
    public Integer getRuleTupleCount() {
        return this.ruleTupleCount;
    }
    public List<SecurityPolicyRuleResponse> getRules() {
        return this.rules;
    }
    public String getSelfLink() {
        return this.selfLink;
    }
    public String getSelfLinkWithId() {
        return this.selfLinkWithId;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationSecurityPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityPolicyAdaptiveProtectionConfigResponse adaptiveProtectionConfig;
        private SecurityPolicyAdvancedOptionsConfigResponse advancedOptionsConfig;
        private List<SecurityPolicyAssociationResponse> associations;
        private String creationTimestamp;
        private String description;
        private String displayName;
        private String fingerprint;
        private String kind;
        private String labelFingerprint;
        private Map<String,String> labels;
        private String name;
        private String parent;
        private SecurityPolicyRecaptchaOptionsConfigResponse recaptchaOptionsConfig;
        private Integer ruleTupleCount;
        private List<SecurityPolicyRuleResponse> rules;
        private String selfLink;
        private String selfLinkWithId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationSecurityPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adaptiveProtectionConfig = defaults.adaptiveProtectionConfig;
    	      this.advancedOptionsConfig = defaults.advancedOptionsConfig;
    	      this.associations = defaults.associations;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.fingerprint = defaults.fingerprint;
    	      this.kind = defaults.kind;
    	      this.labelFingerprint = defaults.labelFingerprint;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.recaptchaOptionsConfig = defaults.recaptchaOptionsConfig;
    	      this.ruleTupleCount = defaults.ruleTupleCount;
    	      this.rules = defaults.rules;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
    	      this.type = defaults.type;
        }

        public Builder setAdaptiveProtectionConfig(SecurityPolicyAdaptiveProtectionConfigResponse adaptiveProtectionConfig) {
            this.adaptiveProtectionConfig = Objects.requireNonNull(adaptiveProtectionConfig);
            return this;
        }

        public Builder setAdvancedOptionsConfig(SecurityPolicyAdvancedOptionsConfigResponse advancedOptionsConfig) {
            this.advancedOptionsConfig = Objects.requireNonNull(advancedOptionsConfig);
            return this;
        }

        public Builder setAssociations(List<SecurityPolicyAssociationResponse> associations) {
            this.associations = Objects.requireNonNull(associations);
            return this;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setFingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLabelFingerprint(String labelFingerprint) {
            this.labelFingerprint = Objects.requireNonNull(labelFingerprint);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParent(String parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }

        public Builder setRecaptchaOptionsConfig(SecurityPolicyRecaptchaOptionsConfigResponse recaptchaOptionsConfig) {
            this.recaptchaOptionsConfig = Objects.requireNonNull(recaptchaOptionsConfig);
            return this;
        }

        public Builder setRuleTupleCount(Integer ruleTupleCount) {
            this.ruleTupleCount = Objects.requireNonNull(ruleTupleCount);
            return this;
        }

        public Builder setRules(List<SecurityPolicyRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setSelfLinkWithId(String selfLinkWithId) {
            this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetOrganizationSecurityPolicyResult build() {
            return new GetOrganizationSecurityPolicyResult(adaptiveProtectionConfig, advancedOptionsConfig, associations, creationTimestamp, description, displayName, fingerprint, kind, labelFingerprint, labels, name, parent, recaptchaOptionsConfig, ruleTupleCount, rules, selfLink, selfLinkWithId, type);
        }
    }
}