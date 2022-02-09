// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.run_v1.outputs.DomainMappingSpecResponse;
import io.pulumi.googlenative.run_v1.outputs.DomainMappingStatusResponse;
import io.pulumi.googlenative.run_v1.outputs.ObjectMetaResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetDomainMappingResult {
    private final String apiVersion;
    private final String kind;
    private final ObjectMetaResponse metadata;
    private final DomainMappingSpecResponse spec;
    private final DomainMappingStatusResponse status;

    @OutputCustomType.Constructor({"apiVersion","kind","metadata","spec","status"})
    private GetDomainMappingResult(
        String apiVersion,
        String kind,
        ObjectMetaResponse metadata,
        DomainMappingSpecResponse spec,
        DomainMappingStatusResponse status) {
        this.apiVersion = Objects.requireNonNull(apiVersion);
        this.kind = Objects.requireNonNull(kind);
        this.metadata = Objects.requireNonNull(metadata);
        this.spec = Objects.requireNonNull(spec);
        this.status = Objects.requireNonNull(status);
    }

    public String getApiVersion() {
        return this.apiVersion;
    }
    public String getKind() {
        return this.kind;
    }
    public ObjectMetaResponse getMetadata() {
        return this.metadata;
    }
    public DomainMappingSpecResponse getSpec() {
        return this.spec;
    }
    public DomainMappingStatusResponse getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainMappingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiVersion;
        private String kind;
        private ObjectMetaResponse metadata;
        private DomainMappingSpecResponse spec;
        private DomainMappingStatusResponse status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainMappingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
    	      this.status = defaults.status;
        }

        public Builder setApiVersion(String apiVersion) {
            this.apiVersion = Objects.requireNonNull(apiVersion);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setMetadata(ObjectMetaResponse metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder setSpec(DomainMappingSpecResponse spec) {
            this.spec = Objects.requireNonNull(spec);
            return this;
        }

        public Builder setStatus(DomainMappingStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public GetDomainMappingResult build() {
            return new GetDomainMappingResult(apiVersion, kind, metadata, spec, status);
        }
    }
}