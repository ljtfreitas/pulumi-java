// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dns_v1.inputs.RRSetRoutingPolicyResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A unit of data that is returned by the DNS servers.
 * 
 */
public final class ResourceRecordSetResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourceRecordSetResponse Empty = new ResourceRecordSetResponse();

    @InputImport(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * For example, www.example.com.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Configures dynamic query responses based on geo location of querying user or a weighted round robin based routing policy. A ResourceRecordSet should only have either rrdata (static) or routing_policy (dynamic). An error is returned otherwise.
     * 
     */
    @InputImport(name="routingPolicy", required=true)
      private final RRSetRoutingPolicyResponse routingPolicy;

    public RRSetRoutingPolicyResponse getRoutingPolicy() {
        return this.routingPolicy;
    }

    /**
     * As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1) -- see examples.
     * 
     */
    @InputImport(name="rrdatas", required=true)
      private final List<String> rrdatas;

    public List<String> getRrdatas() {
        return this.rrdatas;
    }

    /**
     * As defined in RFC 4034 (section 3.2).
     * 
     */
    @InputImport(name="signatureRrdatas", required=true)
      private final List<String> signatureRrdatas;

    public List<String> getSignatureRrdatas() {
        return this.signatureRrdatas;
    }

    /**
     * Number of seconds that this ResourceRecordSet can be cached by resolvers.
     * 
     */
    @InputImport(name="ttl", required=true)
      private final Integer ttl;

    public Integer getTtl() {
        return this.ttl;
    }

    /**
     * The identifier of a supported record type. See the list of Supported DNS record types.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public ResourceRecordSetResponse(
        String kind,
        String name,
        RRSetRoutingPolicyResponse routingPolicy,
        List<String> rrdatas,
        List<String> signatureRrdatas,
        Integer ttl,
        String type) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.routingPolicy = Objects.requireNonNull(routingPolicy, "expected parameter 'routingPolicy' to be non-null");
        this.rrdatas = Objects.requireNonNull(rrdatas, "expected parameter 'rrdatas' to be non-null");
        this.signatureRrdatas = Objects.requireNonNull(signatureRrdatas, "expected parameter 'signatureRrdatas' to be non-null");
        this.ttl = Objects.requireNonNull(ttl, "expected parameter 'ttl' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ResourceRecordSetResponse() {
        this.kind = null;
        this.name = null;
        this.routingPolicy = null;
        this.rrdatas = List.of();
        this.signatureRrdatas = List.of();
        this.ttl = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceRecordSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private String name;
        private RRSetRoutingPolicyResponse routingPolicy;
        private List<String> rrdatas;
        private List<String> signatureRrdatas;
        private Integer ttl;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceRecordSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.routingPolicy = defaults.routingPolicy;
    	      this.rrdatas = defaults.rrdatas;
    	      this.signatureRrdatas = defaults.signatureRrdatas;
    	      this.ttl = defaults.ttl;
    	      this.type = defaults.type;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRoutingPolicy(RRSetRoutingPolicyResponse routingPolicy) {
            this.routingPolicy = Objects.requireNonNull(routingPolicy);
            return this;
        }

        public Builder setRrdatas(List<String> rrdatas) {
            this.rrdatas = Objects.requireNonNull(rrdatas);
            return this;
        }

        public Builder setSignatureRrdatas(List<String> signatureRrdatas) {
            this.signatureRrdatas = Objects.requireNonNull(signatureRrdatas);
            return this;
        }

        public Builder setTtl(Integer ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ResourceRecordSetResponse build() {
            return new ResourceRecordSetResponse(kind, name, routingPolicy, rrdatas, signatureRrdatas, ttl, type);
        }
    }
}
