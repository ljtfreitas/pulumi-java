// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.awsnative.iot.enums.MitigationActionReplaceDefaultPolicyVersionParamsTemplateName;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class MitigationActionReplaceDefaultPolicyVersionParams {
    private final MitigationActionReplaceDefaultPolicyVersionParamsTemplateName templateName;

    @CustomType.Constructor
    private MitigationActionReplaceDefaultPolicyVersionParams(@CustomType.Parameter("templateName") MitigationActionReplaceDefaultPolicyVersionParamsTemplateName templateName) {
        this.templateName = templateName;
    }

    public MitigationActionReplaceDefaultPolicyVersionParamsTemplateName getTemplateName() {
        return this.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MitigationActionReplaceDefaultPolicyVersionParams defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MitigationActionReplaceDefaultPolicyVersionParamsTemplateName templateName;

        public Builder() {
    	      // Empty
        }

        public Builder(MitigationActionReplaceDefaultPolicyVersionParams defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.templateName = defaults.templateName;
        }

        public Builder templateName(MitigationActionReplaceDefaultPolicyVersionParamsTemplateName templateName) {
            this.templateName = Objects.requireNonNull(templateName);
            return this;
        }
        public MitigationActionReplaceDefaultPolicyVersionParams build() {
            return new MitigationActionReplaceDefaultPolicyVersionParams(templateName);
        }
    }
}
