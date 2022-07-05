// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetExternalVpnGatewayArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExternalVpnGatewayArgs Empty = new GetExternalVpnGatewayArgs();

    @Import(name="externalVpnGateway", required=true)
    private Output<String> externalVpnGateway;

    public Output<String> externalVpnGateway() {
        return this.externalVpnGateway;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetExternalVpnGatewayArgs() {}

    private GetExternalVpnGatewayArgs(GetExternalVpnGatewayArgs $) {
        this.externalVpnGateway = $.externalVpnGateway;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExternalVpnGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExternalVpnGatewayArgs $;

        public Builder() {
            $ = new GetExternalVpnGatewayArgs();
        }

        public Builder(GetExternalVpnGatewayArgs defaults) {
            $ = new GetExternalVpnGatewayArgs(Objects.requireNonNull(defaults));
        }

        public Builder externalVpnGateway(Output<String> externalVpnGateway) {
            $.externalVpnGateway = externalVpnGateway;
            return this;
        }

        public Builder externalVpnGateway(String externalVpnGateway) {
            return externalVpnGateway(Output.of(externalVpnGateway));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetExternalVpnGatewayArgs build() {
            $.externalVpnGateway = Objects.requireNonNull($.externalVpnGateway, "expected parameter 'externalVpnGateway' to be non-null");
            return $;
        }
    }

}
