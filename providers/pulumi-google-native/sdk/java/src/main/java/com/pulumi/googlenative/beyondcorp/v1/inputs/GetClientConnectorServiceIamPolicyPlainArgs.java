// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.beyondcorp.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClientConnectorServiceIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClientConnectorServiceIamPolicyPlainArgs Empty = new GetClientConnectorServiceIamPolicyPlainArgs();

    @Import(name="clientConnectorServiceId", required=true)
    private String clientConnectorServiceId;

    public String clientConnectorServiceId() {
        return this.clientConnectorServiceId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetClientConnectorServiceIamPolicyPlainArgs() {}

    private GetClientConnectorServiceIamPolicyPlainArgs(GetClientConnectorServiceIamPolicyPlainArgs $) {
        this.clientConnectorServiceId = $.clientConnectorServiceId;
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClientConnectorServiceIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClientConnectorServiceIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetClientConnectorServiceIamPolicyPlainArgs();
        }

        public Builder(GetClientConnectorServiceIamPolicyPlainArgs defaults) {
            $ = new GetClientConnectorServiceIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientConnectorServiceId(String clientConnectorServiceId) {
            $.clientConnectorServiceId = clientConnectorServiceId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetClientConnectorServiceIamPolicyPlainArgs build() {
            $.clientConnectorServiceId = Objects.requireNonNull($.clientConnectorServiceId, "expected parameter 'clientConnectorServiceId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
