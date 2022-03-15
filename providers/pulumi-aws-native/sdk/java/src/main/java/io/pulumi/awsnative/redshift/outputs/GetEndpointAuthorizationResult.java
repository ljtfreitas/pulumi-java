// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEndpointAuthorizationResult {
    /**
     * Indicates whether all VPCs in the grantee account are allowed access to the cluster.
     * 
     */
    private final @Nullable Boolean allowedAllVPCs;
    /**
     * The VPCs allowed access to the cluster.
     * 
     */
    private final @Nullable List<String> allowedVPCs;
    /**
     * The time (UTC) when the authorization was created.
     * 
     */
    private final @Nullable String authorizeTime;
    /**
     * The status of the cluster.
     * 
     */
    private final @Nullable String clusterStatus;
    /**
     * The number of Redshift-managed VPC endpoints created for the authorization.
     * 
     */
    private final @Nullable Integer endpointCount;
    /**
     * The AWS account ID of the grantee of the cluster.
     * 
     */
    private final @Nullable String grantee;
    /**
     * The AWS account ID of the cluster owner.
     * 
     */
    private final @Nullable String grantor;
    /**
     * The status of the authorization action.
     * 
     */
    private final @Nullable String status;
    /**
     * The virtual private cloud (VPC) identifiers to grant or revoke access to.
     * 
     */
    private final @Nullable List<String> vpcIds;

    @CustomType.Constructor
    private GetEndpointAuthorizationResult(
        @CustomType.Parameter("allowedAllVPCs") @Nullable Boolean allowedAllVPCs,
        @CustomType.Parameter("allowedVPCs") @Nullable List<String> allowedVPCs,
        @CustomType.Parameter("authorizeTime") @Nullable String authorizeTime,
        @CustomType.Parameter("clusterStatus") @Nullable String clusterStatus,
        @CustomType.Parameter("endpointCount") @Nullable Integer endpointCount,
        @CustomType.Parameter("grantee") @Nullable String grantee,
        @CustomType.Parameter("grantor") @Nullable String grantor,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("vpcIds") @Nullable List<String> vpcIds) {
        this.allowedAllVPCs = allowedAllVPCs;
        this.allowedVPCs = allowedVPCs;
        this.authorizeTime = authorizeTime;
        this.clusterStatus = clusterStatus;
        this.endpointCount = endpointCount;
        this.grantee = grantee;
        this.grantor = grantor;
        this.status = status;
        this.vpcIds = vpcIds;
    }

    /**
     * Indicates whether all VPCs in the grantee account are allowed access to the cluster.
     * 
    */
    public Optional<Boolean> getAllowedAllVPCs() {
        return Optional.ofNullable(this.allowedAllVPCs);
    }
    /**
     * The VPCs allowed access to the cluster.
     * 
    */
    public List<String> getAllowedVPCs() {
        return this.allowedVPCs == null ? List.of() : this.allowedVPCs;
    }
    /**
     * The time (UTC) when the authorization was created.
     * 
    */
    public Optional<String> getAuthorizeTime() {
        return Optional.ofNullable(this.authorizeTime);
    }
    /**
     * The status of the cluster.
     * 
    */
    public Optional<String> getClusterStatus() {
        return Optional.ofNullable(this.clusterStatus);
    }
    /**
     * The number of Redshift-managed VPC endpoints created for the authorization.
     * 
    */
    public Optional<Integer> getEndpointCount() {
        return Optional.ofNullable(this.endpointCount);
    }
    /**
     * The AWS account ID of the grantee of the cluster.
     * 
    */
    public Optional<String> getGrantee() {
        return Optional.ofNullable(this.grantee);
    }
    /**
     * The AWS account ID of the cluster owner.
     * 
    */
    public Optional<String> getGrantor() {
        return Optional.ofNullable(this.grantor);
    }
    /**
     * The status of the authorization action.
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * The virtual private cloud (VPC) identifiers to grant or revoke access to.
     * 
    */
    public List<String> getVpcIds() {
        return this.vpcIds == null ? List.of() : this.vpcIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEndpointAuthorizationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowedAllVPCs;
        private @Nullable List<String> allowedVPCs;
        private @Nullable String authorizeTime;
        private @Nullable String clusterStatus;
        private @Nullable Integer endpointCount;
        private @Nullable String grantee;
        private @Nullable String grantor;
        private @Nullable String status;
        private @Nullable List<String> vpcIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEndpointAuthorizationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedAllVPCs = defaults.allowedAllVPCs;
    	      this.allowedVPCs = defaults.allowedVPCs;
    	      this.authorizeTime = defaults.authorizeTime;
    	      this.clusterStatus = defaults.clusterStatus;
    	      this.endpointCount = defaults.endpointCount;
    	      this.grantee = defaults.grantee;
    	      this.grantor = defaults.grantor;
    	      this.status = defaults.status;
    	      this.vpcIds = defaults.vpcIds;
        }

        public Builder allowedAllVPCs(@Nullable Boolean allowedAllVPCs) {
            this.allowedAllVPCs = allowedAllVPCs;
            return this;
        }

        public Builder allowedVPCs(@Nullable List<String> allowedVPCs) {
            this.allowedVPCs = allowedVPCs;
            return this;
        }

        public Builder authorizeTime(@Nullable String authorizeTime) {
            this.authorizeTime = authorizeTime;
            return this;
        }

        public Builder clusterStatus(@Nullable String clusterStatus) {
            this.clusterStatus = clusterStatus;
            return this;
        }

        public Builder endpointCount(@Nullable Integer endpointCount) {
            this.endpointCount = endpointCount;
            return this;
        }

        public Builder grantee(@Nullable String grantee) {
            this.grantee = grantee;
            return this;
        }

        public Builder grantor(@Nullable String grantor) {
            this.grantor = grantor;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder vpcIds(@Nullable List<String> vpcIds) {
            this.vpcIds = vpcIds;
            return this;
        }
        public GetEndpointAuthorizationResult build() {
            return new GetEndpointAuthorizationResult(allowedAllVPCs, allowedVPCs, authorizeTime, clusterStatus, endpointCount, grantee, grantor, status, vpcIds);
        }
    }
}
