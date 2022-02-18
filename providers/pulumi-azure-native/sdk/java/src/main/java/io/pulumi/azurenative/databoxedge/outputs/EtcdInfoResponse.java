// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class EtcdInfoResponse {
    /**
     * Etcd type
     * 
     */
    private final String type;
    /**
     * Etcd version
     * 
     */
    private final String version;

    @OutputCustomType.Constructor({"type","version"})
    private EtcdInfoResponse(
        String type,
        String version) {
        this.type = Objects.requireNonNull(type);
        this.version = Objects.requireNonNull(version);
    }

    /**
     * Etcd type
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * Etcd version
     * 
     */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EtcdInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(EtcdInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public EtcdInfoResponse build() {
            return new EtcdInfoResponse(type, version);
        }
    }
}
