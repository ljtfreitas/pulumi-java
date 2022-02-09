// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class AptRepositoryResponse extends io.pulumi.resources.InvokeArgs {

    public static final AptRepositoryResponse Empty = new AptRepositoryResponse();

    @InputImport(name="archiveType", required=true)
    private final String archiveType;

    public String getArchiveType() {
        return this.archiveType;
    }

    @InputImport(name="components", required=true)
    private final List<String> components;

    public List<String> getComponents() {
        return this.components;
    }

    @InputImport(name="distribution", required=true)
    private final String distribution;

    public String getDistribution() {
        return this.distribution;
    }

    @InputImport(name="gpgKey", required=true)
    private final String gpgKey;

    public String getGpgKey() {
        return this.gpgKey;
    }

    @InputImport(name="uri", required=true)
    private final String uri;

    public String getUri() {
        return this.uri;
    }

    public AptRepositoryResponse(
        String archiveType,
        List<String> components,
        String distribution,
        String gpgKey,
        String uri) {
        this.archiveType = Objects.requireNonNull(archiveType, "expected parameter 'archiveType' to be non-null");
        this.components = Objects.requireNonNull(components, "expected parameter 'components' to be non-null");
        this.distribution = Objects.requireNonNull(distribution, "expected parameter 'distribution' to be non-null");
        this.gpgKey = Objects.requireNonNull(gpgKey, "expected parameter 'gpgKey' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private AptRepositoryResponse() {
        this.archiveType = null;
        this.components = List.of();
        this.distribution = null;
        this.gpgKey = null;
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AptRepositoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String archiveType;
        private List<String> components;
        private String distribution;
        private String gpgKey;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(AptRepositoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveType = defaults.archiveType;
    	      this.components = defaults.components;
    	      this.distribution = defaults.distribution;
    	      this.gpgKey = defaults.gpgKey;
    	      this.uri = defaults.uri;
        }

        public Builder setArchiveType(String archiveType) {
            this.archiveType = Objects.requireNonNull(archiveType);
            return this;
        }

        public Builder setComponents(List<String> components) {
            this.components = Objects.requireNonNull(components);
            return this;
        }

        public Builder setDistribution(String distribution) {
            this.distribution = Objects.requireNonNull(distribution);
            return this;
        }

        public Builder setGpgKey(String gpgKey) {
            this.gpgKey = Objects.requireNonNull(gpgKey);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public AptRepositoryResponse build() {
            return new AptRepositoryResponse(archiveType, components, distribution, gpgKey, uri);
        }
    }
}