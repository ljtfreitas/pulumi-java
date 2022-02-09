// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.VersionSourceResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public final class Hl7SchemaConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final Hl7SchemaConfigResponse Empty = new Hl7SchemaConfigResponse();

    @InputImport(name="messageSchemaConfigs", required=true)
    private final Map<String,String> messageSchemaConfigs;

    public Map<String,String> getMessageSchemaConfigs() {
        return this.messageSchemaConfigs;
    }

    @InputImport(name="version", required=true)
    private final List<VersionSourceResponse> version;

    public List<VersionSourceResponse> getVersion() {
        return this.version;
    }

    public Hl7SchemaConfigResponse(
        Map<String,String> messageSchemaConfigs,
        List<VersionSourceResponse> version) {
        this.messageSchemaConfigs = Objects.requireNonNull(messageSchemaConfigs, "expected parameter 'messageSchemaConfigs' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private Hl7SchemaConfigResponse() {
        this.messageSchemaConfigs = Map.of();
        this.version = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Hl7SchemaConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> messageSchemaConfigs;
        private List<VersionSourceResponse> version;

        public Builder() {
    	      // Empty
        }

        public Builder(Hl7SchemaConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageSchemaConfigs = defaults.messageSchemaConfigs;
    	      this.version = defaults.version;
        }

        public Builder setMessageSchemaConfigs(Map<String,String> messageSchemaConfigs) {
            this.messageSchemaConfigs = Objects.requireNonNull(messageSchemaConfigs);
            return this;
        }

        public Builder setVersion(List<VersionSourceResponse> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public Hl7SchemaConfigResponse build() {
            return new Hl7SchemaConfigResponse(messageSchemaConfigs, version);
        }
    }
}