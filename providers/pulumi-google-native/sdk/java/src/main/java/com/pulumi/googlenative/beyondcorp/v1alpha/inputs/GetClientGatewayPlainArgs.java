// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.beyondcorp.v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClientGatewayPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClientGatewayPlainArgs Empty = new GetClientGatewayPlainArgs();

    @Import(name="clientGatewayId", required=true)
    private String clientGatewayId;

    public String clientGatewayId() {
        return this.clientGatewayId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetClientGatewayPlainArgs() {}

    private GetClientGatewayPlainArgs(GetClientGatewayPlainArgs $) {
        this.clientGatewayId = $.clientGatewayId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClientGatewayPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClientGatewayPlainArgs $;

        public Builder() {
            $ = new GetClientGatewayPlainArgs();
        }

        public Builder(GetClientGatewayPlainArgs defaults) {
            $ = new GetClientGatewayPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientGatewayId(String clientGatewayId) {
            $.clientGatewayId = clientGatewayId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetClientGatewayPlainArgs build() {
            $.clientGatewayId = Objects.requireNonNull($.clientGatewayId, "expected parameter 'clientGatewayId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
