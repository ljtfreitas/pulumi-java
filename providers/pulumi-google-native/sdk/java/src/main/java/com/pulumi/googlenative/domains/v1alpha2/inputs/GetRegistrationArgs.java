// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains.v1alpha2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegistrationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegistrationArgs Empty = new GetRegistrationArgs();

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="registrationId", required=true)
    private Output<String> registrationId;

    public Output<String> registrationId() {
        return this.registrationId;
    }

    private GetRegistrationArgs() {}

    private GetRegistrationArgs(GetRegistrationArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.registrationId = $.registrationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegistrationArgs $;

        public Builder() {
            $ = new GetRegistrationArgs();
        }

        public Builder(GetRegistrationArgs defaults) {
            $ = new GetRegistrationArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder registrationId(Output<String> registrationId) {
            $.registrationId = registrationId;
            return this;
        }

        public Builder registrationId(String registrationId) {
            return registrationId(Output.of(registrationId));
        }

        public GetRegistrationArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.registrationId = Objects.requireNonNull($.registrationId, "expected parameter 'registrationId' to be non-null");
            return $;
        }
    }

}
