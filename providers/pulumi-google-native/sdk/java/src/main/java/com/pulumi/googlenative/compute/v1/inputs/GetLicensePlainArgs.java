// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLicensePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLicensePlainArgs Empty = new GetLicensePlainArgs();

    @Import(name="license", required=true)
    private String license;

    public String license() {
        return this.license;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetLicensePlainArgs() {}

    private GetLicensePlainArgs(GetLicensePlainArgs $) {
        this.license = $.license;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLicensePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLicensePlainArgs $;

        public Builder() {
            $ = new GetLicensePlainArgs();
        }

        public Builder(GetLicensePlainArgs defaults) {
            $ = new GetLicensePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder license(String license) {
            $.license = license;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetLicensePlainArgs build() {
            $.license = Objects.requireNonNull($.license, "expected parameter 'license' to be non-null");
            return $;
        }
    }

}
