// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetHostSecurityReportPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHostSecurityReportPlainArgs Empty = new GetHostSecurityReportPlainArgs();

    @Import(name="hostSecurityReportId", required=true)
    private String hostSecurityReportId;

    public String hostSecurityReportId() {
        return this.hostSecurityReportId;
    }

    @Import(name="organizationId", required=true)
    private String organizationId;

    public String organizationId() {
        return this.organizationId;
    }

    private GetHostSecurityReportPlainArgs() {}

    private GetHostSecurityReportPlainArgs(GetHostSecurityReportPlainArgs $) {
        this.hostSecurityReportId = $.hostSecurityReportId;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHostSecurityReportPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHostSecurityReportPlainArgs $;

        public Builder() {
            $ = new GetHostSecurityReportPlainArgs();
        }

        public Builder(GetHostSecurityReportPlainArgs defaults) {
            $ = new GetHostSecurityReportPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder hostSecurityReportId(String hostSecurityReportId) {
            $.hostSecurityReportId = hostSecurityReportId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public GetHostSecurityReportPlainArgs build() {
            $.hostSecurityReportId = Objects.requireNonNull($.hostSecurityReportId, "expected parameter 'hostSecurityReportId' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}
