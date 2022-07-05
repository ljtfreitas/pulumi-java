// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionSslCertificateArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionSslCertificateArgs Empty = new GetRegionSslCertificateArgs();

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    @Import(name="sslCertificate", required=true)
    private Output<String> sslCertificate;

    public Output<String> sslCertificate() {
        return this.sslCertificate;
    }

    private GetRegionSslCertificateArgs() {}

    private GetRegionSslCertificateArgs(GetRegionSslCertificateArgs $) {
        this.project = $.project;
        this.region = $.region;
        this.sslCertificate = $.sslCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionSslCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionSslCertificateArgs $;

        public Builder() {
            $ = new GetRegionSslCertificateArgs();
        }

        public Builder(GetRegionSslCertificateArgs defaults) {
            $ = new GetRegionSslCertificateArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder sslCertificate(Output<String> sslCertificate) {
            $.sslCertificate = sslCertificate;
            return this;
        }

        public Builder sslCertificate(String sslCertificate) {
            return sslCertificate(Output.of(sslCertificate));
        }

        public GetRegionSslCertificateArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            $.sslCertificate = Objects.requireNonNull($.sslCertificate, "expected parameter 'sslCertificate' to be non-null");
            return $;
        }
    }

}
