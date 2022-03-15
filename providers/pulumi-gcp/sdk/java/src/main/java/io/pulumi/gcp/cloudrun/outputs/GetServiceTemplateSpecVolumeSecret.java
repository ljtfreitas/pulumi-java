// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.cloudrun.outputs.GetServiceTemplateSpecVolumeSecretItem;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServiceTemplateSpecVolumeSecret {
    private final Integer defaultMode;
    private final List<GetServiceTemplateSpecVolumeSecretItem> items;
    private final String secretName;

    @CustomType.Constructor
    private GetServiceTemplateSpecVolumeSecret(
        @CustomType.Parameter("defaultMode") Integer defaultMode,
        @CustomType.Parameter("items") List<GetServiceTemplateSpecVolumeSecretItem> items,
        @CustomType.Parameter("secretName") String secretName) {
        this.defaultMode = defaultMode;
        this.items = items;
        this.secretName = secretName;
    }

    public Integer getDefaultMode() {
        return this.defaultMode;
    }
    public List<GetServiceTemplateSpecVolumeSecretItem> getItems() {
        return this.items;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplateSpecVolumeSecret defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer defaultMode;
        private List<GetServiceTemplateSpecVolumeSecretItem> items;
        private String secretName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceTemplateSpecVolumeSecret defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultMode = defaults.defaultMode;
    	      this.items = defaults.items;
    	      this.secretName = defaults.secretName;
        }

        public Builder defaultMode(Integer defaultMode) {
            this.defaultMode = Objects.requireNonNull(defaultMode);
            return this;
        }

        public Builder items(List<GetServiceTemplateSpecVolumeSecretItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public Builder secretName(String secretName) {
            this.secretName = Objects.requireNonNull(secretName);
            return this;
        }
        public GetServiceTemplateSpecVolumeSecret build() {
            return new GetServiceTemplateSpecVolumeSecret(defaultMode, items, secretName);
        }
    }
}
