// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.outputs;

import io.pulumi.azurenative.servicefabric.outputs.SettingsParameterDescriptionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SettingsSectionDescriptionResponse {
    /**
     * The section name of the fabric settings.
     * 
     */
    private final String name;
    /**
     * The collection of parameters in the section.
     * 
     */
    private final List<SettingsParameterDescriptionResponse> parameters;

    @OutputCustomType.Constructor({"name","parameters"})
    private SettingsSectionDescriptionResponse(
        String name,
        List<SettingsParameterDescriptionResponse> parameters) {
        this.name = Objects.requireNonNull(name);
        this.parameters = Objects.requireNonNull(parameters);
    }

    /**
     * The section name of the fabric settings.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The collection of parameters in the section.
     * 
     */
    public List<SettingsParameterDescriptionResponse> getParameters() {
        return this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingsSectionDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<SettingsParameterDescriptionResponse> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(SettingsSectionDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(List<SettingsParameterDescriptionResponse> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public SettingsSectionDescriptionResponse build() {
            return new SettingsSectionDescriptionResponse(name, parameters);
        }
    }
}
