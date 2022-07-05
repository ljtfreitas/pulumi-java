// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.websecurityscanner.v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetScanConfigPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetScanConfigPlainArgs Empty = new GetScanConfigPlainArgs();

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="scanConfigId", required=true)
    private String scanConfigId;

    public String scanConfigId() {
        return this.scanConfigId;
    }

    private GetScanConfigPlainArgs() {}

    private GetScanConfigPlainArgs(GetScanConfigPlainArgs $) {
        this.project = $.project;
        this.scanConfigId = $.scanConfigId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetScanConfigPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetScanConfigPlainArgs $;

        public Builder() {
            $ = new GetScanConfigPlainArgs();
        }

        public Builder(GetScanConfigPlainArgs defaults) {
            $ = new GetScanConfigPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder scanConfigId(String scanConfigId) {
            $.scanConfigId = scanConfigId;
            return this;
        }

        public GetScanConfigPlainArgs build() {
            $.scanConfigId = Objects.requireNonNull($.scanConfigId, "expected parameter 'scanConfigId' to be non-null");
            return $;
        }
    }

}
