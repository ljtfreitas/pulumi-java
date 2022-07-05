// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpnGatewayPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpnGatewayPlainArgs Empty = new GetVpnGatewayPlainArgs();

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private String region;

    public String region() {
        return this.region;
    }

    @Import(name="vpnGateway", required=true)
    private String vpnGateway;

    public String vpnGateway() {
        return this.vpnGateway;
    }

    private GetVpnGatewayPlainArgs() {}

    private GetVpnGatewayPlainArgs(GetVpnGatewayPlainArgs $) {
        this.project = $.project;
        this.region = $.region;
        this.vpnGateway = $.vpnGateway;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpnGatewayPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpnGatewayPlainArgs $;

        public Builder() {
            $ = new GetVpnGatewayPlainArgs();
        }

        public Builder(GetVpnGatewayPlainArgs defaults) {
            $ = new GetVpnGatewayPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder region(String region) {
            $.region = region;
            return this;
        }

        public Builder vpnGateway(String vpnGateway) {
            $.vpnGateway = vpnGateway;
            return this;
        }

        public GetVpnGatewayPlainArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            $.vpnGateway = Objects.requireNonNull($.vpnGateway, "expected parameter 'vpnGateway' to be non-null");
            return $;
        }
    }

}
