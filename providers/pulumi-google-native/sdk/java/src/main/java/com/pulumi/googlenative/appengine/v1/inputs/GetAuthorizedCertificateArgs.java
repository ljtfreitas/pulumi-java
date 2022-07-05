// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAuthorizedCertificateArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAuthorizedCertificateArgs Empty = new GetAuthorizedCertificateArgs();

    @Import(name="appId", required=true)
    private Output<String> appId;

    public Output<String> appId() {
        return this.appId;
    }

    @Import(name="authorizedCertificateId", required=true)
    private Output<String> authorizedCertificateId;

    public Output<String> authorizedCertificateId() {
        return this.authorizedCertificateId;
    }

    @Import(name="view")
    private @Nullable Output<String> view;

    public Optional<Output<String>> view() {
        return Optional.ofNullable(this.view);
    }

    private GetAuthorizedCertificateArgs() {}

    private GetAuthorizedCertificateArgs(GetAuthorizedCertificateArgs $) {
        this.appId = $.appId;
        this.authorizedCertificateId = $.authorizedCertificateId;
        this.view = $.view;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAuthorizedCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAuthorizedCertificateArgs $;

        public Builder() {
            $ = new GetAuthorizedCertificateArgs();
        }

        public Builder(GetAuthorizedCertificateArgs defaults) {
            $ = new GetAuthorizedCertificateArgs(Objects.requireNonNull(defaults));
        }

        public Builder appId(Output<String> appId) {
            $.appId = appId;
            return this;
        }

        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        public Builder authorizedCertificateId(Output<String> authorizedCertificateId) {
            $.authorizedCertificateId = authorizedCertificateId;
            return this;
        }

        public Builder authorizedCertificateId(String authorizedCertificateId) {
            return authorizedCertificateId(Output.of(authorizedCertificateId));
        }

        public Builder view(@Nullable Output<String> view) {
            $.view = view;
            return this;
        }

        public Builder view(String view) {
            return view(Output.of(view));
        }

        public GetAuthorizedCertificateArgs build() {
            $.appId = Objects.requireNonNull($.appId, "expected parameter 'appId' to be non-null");
            $.authorizedCertificateId = Objects.requireNonNull($.authorizedCertificateId, "expected parameter 'authorizedCertificateId' to be non-null");
            return $;
        }
    }

}
