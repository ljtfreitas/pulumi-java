// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeInfoTypeArgs;
import java.lang.Integer;
import java.util.Objects;


public final class PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs Empty = new PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs();

    /**
     * CustomInfoType can either be a new infoType, or an extension of built-in infoType, when the name matches one of existing
     * infoTypes and that infoType is specified in `info_types` field. Specifying the latter adds findings to the
     * one detected by the system. If built-in info type is not specified in `info_types` list then the name is
     * treated as a custom info type.
     * Structure is documented below.
     * 
     */
    @InputImport(name="infoType", required=true)
        private final Input<PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeInfoTypeArgs> infoType;

    public Input<PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeInfoTypeArgs> getInfoType() {
        return this.infoType;
    }

    /**
     * Max findings limit for the given infoType.
     * 
     */
    @InputImport(name="maxFindings", required=true)
        private final Input<Integer> maxFindings;

    public Input<Integer> getMaxFindings() {
        return this.maxFindings;
    }

    public PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs(
        Input<PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeInfoTypeArgs> infoType,
        Input<Integer> maxFindings) {
        this.infoType = Objects.requireNonNull(infoType, "expected parameter 'infoType' to be non-null");
        this.maxFindings = Objects.requireNonNull(maxFindings, "expected parameter 'maxFindings' to be non-null");
    }

    private PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs() {
        this.infoType = Input.empty();
        this.maxFindings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeInfoTypeArgs> infoType;
        private Input<Integer> maxFindings;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infoType = defaults.infoType;
    	      this.maxFindings = defaults.maxFindings;
        }

        public Builder setInfoType(Input<PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeInfoTypeArgs> infoType) {
            this.infoType = Objects.requireNonNull(infoType);
            return this;
        }

        public Builder setInfoType(PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeInfoTypeArgs infoType) {
            this.infoType = Input.of(Objects.requireNonNull(infoType));
            return this;
        }

        public Builder setMaxFindings(Input<Integer> maxFindings) {
            this.maxFindings = Objects.requireNonNull(maxFindings);
            return this;
        }

        public Builder setMaxFindings(Integer maxFindings) {
            this.maxFindings = Input.of(Objects.requireNonNull(maxFindings));
            return this;
        }
        public PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs build() {
            return new PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs(infoType, maxFindings);
        }
    }
}
