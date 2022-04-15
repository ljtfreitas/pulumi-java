// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.activedirectory;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainTrustArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainTrustArgs Empty = new DomainTrustArgs();

    /**
     * The fully qualified domain name. e.g. mydomain.myorganization.com, with the restrictions,
     * https://cloud.google.com/managed-microsoft-ad/reference/rest/v1/projects.locations.global.domains.
     * 
     */
    @Import(name="domain", required=true)
      private final Output<String> domain;

    public Output<String> domain() {
        return this.domain;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Whether the trusted side has forest/domain wide access or selective access to an approved set of resources.
     * 
     */
    @Import(name="selectiveAuthentication")
      private final @Nullable Output<Boolean> selectiveAuthentication;

    public Output<Boolean> selectiveAuthentication() {
        return this.selectiveAuthentication == null ? Codegen.empty() : this.selectiveAuthentication;
    }

    /**
     * The target DNS server IP addresses which can resolve the remote domain involved in the trust.
     * 
     */
    @Import(name="targetDnsIpAddresses", required=true)
      private final Output<List<String>> targetDnsIpAddresses;

    public Output<List<String>> targetDnsIpAddresses() {
        return this.targetDnsIpAddresses;
    }

    /**
     * The fully qualified target domain name which will be in trust with the current domain.
     * 
     */
    @Import(name="targetDomainName", required=true)
      private final Output<String> targetDomainName;

    public Output<String> targetDomainName() {
        return this.targetDomainName;
    }

    /**
     * The trust direction, which decides if the current domain is trusted, trusting, or both.
     * Possible values are `INBOUND`, `OUTBOUND`, and `BIDIRECTIONAL`.
     * 
     */
    @Import(name="trustDirection", required=true)
      private final Output<String> trustDirection;

    public Output<String> trustDirection() {
        return this.trustDirection;
    }

    /**
     * The trust secret used for the handshake with the target domain. This will not be stored.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="trustHandshakeSecret", required=true)
      private final Output<String> trustHandshakeSecret;

    public Output<String> trustHandshakeSecret() {
        return this.trustHandshakeSecret;
    }

    /**
     * The type of trust represented by the trust resource.
     * Possible values are `FOREST` and `EXTERNAL`.
     * 
     */
    @Import(name="trustType", required=true)
      private final Output<String> trustType;

    public Output<String> trustType() {
        return this.trustType;
    }

    public DomainTrustArgs(
        Output<String> domain,
        @Nullable Output<String> project,
        @Nullable Output<Boolean> selectiveAuthentication,
        Output<List<String>> targetDnsIpAddresses,
        Output<String> targetDomainName,
        Output<String> trustDirection,
        Output<String> trustHandshakeSecret,
        Output<String> trustType) {
        this.domain = Objects.requireNonNull(domain, "expected parameter 'domain' to be non-null");
        this.project = project;
        this.selectiveAuthentication = selectiveAuthentication;
        this.targetDnsIpAddresses = Objects.requireNonNull(targetDnsIpAddresses, "expected parameter 'targetDnsIpAddresses' to be non-null");
        this.targetDomainName = Objects.requireNonNull(targetDomainName, "expected parameter 'targetDomainName' to be non-null");
        this.trustDirection = Objects.requireNonNull(trustDirection, "expected parameter 'trustDirection' to be non-null");
        this.trustHandshakeSecret = Objects.requireNonNull(trustHandshakeSecret, "expected parameter 'trustHandshakeSecret' to be non-null");
        this.trustType = Objects.requireNonNull(trustType, "expected parameter 'trustType' to be non-null");
    }

    private DomainTrustArgs() {
        this.domain = Codegen.empty();
        this.project = Codegen.empty();
        this.selectiveAuthentication = Codegen.empty();
        this.targetDnsIpAddresses = Codegen.empty();
        this.targetDomainName = Codegen.empty();
        this.trustDirection = Codegen.empty();
        this.trustHandshakeSecret = Codegen.empty();
        this.trustType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainTrustArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> domain;
        private @Nullable Output<String> project;
        private @Nullable Output<Boolean> selectiveAuthentication;
        private Output<List<String>> targetDnsIpAddresses;
        private Output<String> targetDomainName;
        private Output<String> trustDirection;
        private Output<String> trustHandshakeSecret;
        private Output<String> trustType;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainTrustArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.project = defaults.project;
    	      this.selectiveAuthentication = defaults.selectiveAuthentication;
    	      this.targetDnsIpAddresses = defaults.targetDnsIpAddresses;
    	      this.targetDomainName = defaults.targetDomainName;
    	      this.trustDirection = defaults.trustDirection;
    	      this.trustHandshakeSecret = defaults.trustHandshakeSecret;
    	      this.trustType = defaults.trustType;
        }

        public Builder domain(Output<String> domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        public Builder domain(String domain) {
            this.domain = Output.of(Objects.requireNonNull(domain));
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder selectiveAuthentication(@Nullable Output<Boolean> selectiveAuthentication) {
            this.selectiveAuthentication = selectiveAuthentication;
            return this;
        }
        public Builder selectiveAuthentication(@Nullable Boolean selectiveAuthentication) {
            this.selectiveAuthentication = Codegen.ofNullable(selectiveAuthentication);
            return this;
        }
        public Builder targetDnsIpAddresses(Output<List<String>> targetDnsIpAddresses) {
            this.targetDnsIpAddresses = Objects.requireNonNull(targetDnsIpAddresses);
            return this;
        }
        public Builder targetDnsIpAddresses(List<String> targetDnsIpAddresses) {
            this.targetDnsIpAddresses = Output.of(Objects.requireNonNull(targetDnsIpAddresses));
            return this;
        }
        public Builder targetDnsIpAddresses(String... targetDnsIpAddresses) {
            return targetDnsIpAddresses(List.of(targetDnsIpAddresses));
        }
        public Builder targetDomainName(Output<String> targetDomainName) {
            this.targetDomainName = Objects.requireNonNull(targetDomainName);
            return this;
        }
        public Builder targetDomainName(String targetDomainName) {
            this.targetDomainName = Output.of(Objects.requireNonNull(targetDomainName));
            return this;
        }
        public Builder trustDirection(Output<String> trustDirection) {
            this.trustDirection = Objects.requireNonNull(trustDirection);
            return this;
        }
        public Builder trustDirection(String trustDirection) {
            this.trustDirection = Output.of(Objects.requireNonNull(trustDirection));
            return this;
        }
        public Builder trustHandshakeSecret(Output<String> trustHandshakeSecret) {
            this.trustHandshakeSecret = Objects.requireNonNull(trustHandshakeSecret);
            return this;
        }
        public Builder trustHandshakeSecret(String trustHandshakeSecret) {
            this.trustHandshakeSecret = Output.of(Objects.requireNonNull(trustHandshakeSecret));
            return this;
        }
        public Builder trustType(Output<String> trustType) {
            this.trustType = Objects.requireNonNull(trustType);
            return this;
        }
        public Builder trustType(String trustType) {
            this.trustType = Output.of(Objects.requireNonNull(trustType));
            return this;
        }        public DomainTrustArgs build() {
            return new DomainTrustArgs(domain, project, selectiveAuthentication, targetDnsIpAddresses, targetDomainName, trustDirection, trustHandshakeSecret, trustType);
        }
    }
}
