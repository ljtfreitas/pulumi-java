// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains.v1alpha2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegistrationIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegistrationIamPolicyPlainArgs Empty = new GetRegistrationIamPolicyPlainArgs();

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

    @Import(name="registrationId", required=true)
    private String registrationId;

    public String registrationId() {
        return this.registrationId;
    }

    private GetRegistrationIamPolicyPlainArgs() {}

    private GetRegistrationIamPolicyPlainArgs(GetRegistrationIamPolicyPlainArgs $) {
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
        this.registrationId = $.registrationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegistrationIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegistrationIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetRegistrationIamPolicyPlainArgs();
        }

        public Builder(GetRegistrationIamPolicyPlainArgs defaults) {
            $ = new GetRegistrationIamPolicyPlainArgs(Objects.requireNonNull(defaults));
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

        public Builder registrationId(String registrationId) {
            $.registrationId = registrationId;
            return this;
        }

        public GetRegistrationIamPolicyPlainArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.registrationId = Objects.requireNonNull($.registrationId, "expected parameter 'registrationId' to be non-null");
            return $;
        }
    }

}
