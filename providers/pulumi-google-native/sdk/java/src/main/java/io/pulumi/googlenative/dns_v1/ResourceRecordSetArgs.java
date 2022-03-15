// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dns_v1.inputs.RRSetRoutingPolicyArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceRecordSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceRecordSetArgs Empty = new ResourceRecordSetArgs();

    @Import(name="clientOperationId")
      private final @Nullable Output<String> clientOperationId;

    public Output<String> getClientOperationId() {
        return this.clientOperationId == null ? Output.empty() : this.clientOperationId;
    }

    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    @Import(name="managedZone", required=true)
      private final Output<String> managedZone;

    public Output<String> getManagedZone() {
        return this.managedZone;
    }

    /**
     * For example, www.example.com.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Configures dynamic query responses based on geo location of querying user or a weighted round robin based routing policy. A ResourceRecordSet should only have either rrdata (static) or routing_policy (dynamic). An error is returned otherwise.
     * 
     */
    @Import(name="routingPolicy")
      private final @Nullable Output<RRSetRoutingPolicyArgs> routingPolicy;

    public Output<RRSetRoutingPolicyArgs> getRoutingPolicy() {
        return this.routingPolicy == null ? Output.empty() : this.routingPolicy;
    }

    /**
     * As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1) -- see examples.
     * 
     */
    @Import(name="rrdatas")
      private final @Nullable Output<List<String>> rrdatas;

    public Output<List<String>> getRrdatas() {
        return this.rrdatas == null ? Output.empty() : this.rrdatas;
    }

    /**
     * As defined in RFC 4034 (section 3.2).
     * 
     */
    @Import(name="signatureRrdatas")
      private final @Nullable Output<List<String>> signatureRrdatas;

    public Output<List<String>> getSignatureRrdatas() {
        return this.signatureRrdatas == null ? Output.empty() : this.signatureRrdatas;
    }

    /**
     * Number of seconds that this ResourceRecordSet can be cached by resolvers.
     * 
     */
    @Import(name="ttl")
      private final @Nullable Output<Integer> ttl;

    public Output<Integer> getTtl() {
        return this.ttl == null ? Output.empty() : this.ttl;
    }

    /**
     * The identifier of a supported record type. See the list of Supported DNS record types.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public ResourceRecordSetArgs(
        @Nullable Output<String> clientOperationId,
        @Nullable Output<String> kind,
        Output<String> managedZone,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<RRSetRoutingPolicyArgs> routingPolicy,
        @Nullable Output<List<String>> rrdatas,
        @Nullable Output<List<String>> signatureRrdatas,
        @Nullable Output<Integer> ttl,
        @Nullable Output<String> type) {
        this.clientOperationId = clientOperationId;
        this.kind = kind;
        this.managedZone = Objects.requireNonNull(managedZone, "expected parameter 'managedZone' to be non-null");
        this.name = name;
        this.project = project;
        this.routingPolicy = routingPolicy;
        this.rrdatas = rrdatas;
        this.signatureRrdatas = signatureRrdatas;
        this.ttl = ttl;
        this.type = type;
    }

    private ResourceRecordSetArgs() {
        this.clientOperationId = Output.empty();
        this.kind = Output.empty();
        this.managedZone = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.routingPolicy = Output.empty();
        this.rrdatas = Output.empty();
        this.signatureRrdatas = Output.empty();
        this.ttl = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceRecordSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clientOperationId;
        private @Nullable Output<String> kind;
        private Output<String> managedZone;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<RRSetRoutingPolicyArgs> routingPolicy;
        private @Nullable Output<List<String>> rrdatas;
        private @Nullable Output<List<String>> signatureRrdatas;
        private @Nullable Output<Integer> ttl;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceRecordSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientOperationId = defaults.clientOperationId;
    	      this.kind = defaults.kind;
    	      this.managedZone = defaults.managedZone;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.routingPolicy = defaults.routingPolicy;
    	      this.rrdatas = defaults.rrdatas;
    	      this.signatureRrdatas = defaults.signatureRrdatas;
    	      this.ttl = defaults.ttl;
    	      this.type = defaults.type;
        }

        public Builder clientOperationId(@Nullable Output<String> clientOperationId) {
            this.clientOperationId = clientOperationId;
            return this;
        }

        public Builder clientOperationId(@Nullable String clientOperationId) {
            this.clientOperationId = Output.ofNullable(clientOperationId);
            return this;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }

        public Builder managedZone(Output<String> managedZone) {
            this.managedZone = Objects.requireNonNull(managedZone);
            return this;
        }

        public Builder managedZone(String managedZone) {
            this.managedZone = Output.of(Objects.requireNonNull(managedZone));
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder routingPolicy(@Nullable Output<RRSetRoutingPolicyArgs> routingPolicy) {
            this.routingPolicy = routingPolicy;
            return this;
        }

        public Builder routingPolicy(@Nullable RRSetRoutingPolicyArgs routingPolicy) {
            this.routingPolicy = Output.ofNullable(routingPolicy);
            return this;
        }

        public Builder rrdatas(@Nullable Output<List<String>> rrdatas) {
            this.rrdatas = rrdatas;
            return this;
        }

        public Builder rrdatas(@Nullable List<String> rrdatas) {
            this.rrdatas = Output.ofNullable(rrdatas);
            return this;
        }

        public Builder signatureRrdatas(@Nullable Output<List<String>> signatureRrdatas) {
            this.signatureRrdatas = signatureRrdatas;
            return this;
        }

        public Builder signatureRrdatas(@Nullable List<String> signatureRrdatas) {
            this.signatureRrdatas = Output.ofNullable(signatureRrdatas);
            return this;
        }

        public Builder ttl(@Nullable Output<Integer> ttl) {
            this.ttl = ttl;
            return this;
        }

        public Builder ttl(@Nullable Integer ttl) {
            this.ttl = Output.ofNullable(ttl);
            return this;
        }

        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }
        public ResourceRecordSetArgs build() {
            return new ResourceRecordSetArgs(clientOperationId, kind, managedZone, name, project, routingPolicy, rrdatas, signatureRrdatas, ttl, type);
        }
    }
}
