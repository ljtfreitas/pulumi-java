// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudkms_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudkms_v1.outputs.ServiceResolverResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetEkmConnectionResult {
    /**
     * The time at which the EkmConnection was created.
     * 
     */
    private final String createTime;
    /**
     * This checksum is computed by the server based on the value of other fields, and may be sent on update requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    private final String etag;
    /**
     * The resource name for the EkmConnection in the format `projects/*{@literal /}locations/*{@literal /}ekmConnections/*`.
     * 
     */
    private final String name;
    /**
     * A list of ServiceResolvers where the EKM can be reached. There should be one ServiceResolver per EKM replica. Currently, only a single ServiceResolver is supported.
     * 
     */
    private final List<ServiceResolverResponse> serviceResolvers;

    @OutputCustomType.Constructor({"createTime","etag","name","serviceResolvers"})
    private GetEkmConnectionResult(
        String createTime,
        String etag,
        String name,
        List<ServiceResolverResponse> serviceResolvers) {
        this.createTime = Objects.requireNonNull(createTime);
        this.etag = Objects.requireNonNull(etag);
        this.name = Objects.requireNonNull(name);
        this.serviceResolvers = Objects.requireNonNull(serviceResolvers);
    }

    /**
     * The time at which the EkmConnection was created.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * This checksum is computed by the server based on the value of other fields, and may be sent on update requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The resource name for the EkmConnection in the format `projects/*{@literal /}locations/*{@literal /}ekmConnections/*`.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * A list of ServiceResolvers where the EKM can be reached. There should be one ServiceResolver per EKM replica. Currently, only a single ServiceResolver is supported.
     * 
     */
    public List<ServiceResolverResponse> getServiceResolvers() {
        return this.serviceResolvers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEkmConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String etag;
        private String name;
        private List<ServiceResolverResponse> serviceResolvers;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEkmConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.etag = defaults.etag;
    	      this.name = defaults.name;
    	      this.serviceResolvers = defaults.serviceResolvers;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setServiceResolvers(List<ServiceResolverResponse> serviceResolvers) {
            this.serviceResolvers = Objects.requireNonNull(serviceResolvers);
            return this;
        }
        public GetEkmConnectionResult build() {
            return new GetEkmConnectionResult(createTime, etag, name, serviceResolvers);
        }
    }
}
