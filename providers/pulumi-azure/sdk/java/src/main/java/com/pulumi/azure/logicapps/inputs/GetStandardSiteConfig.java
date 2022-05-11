// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps.inputs;

import com.pulumi.azure.logicapps.inputs.GetStandardSiteConfigCors;
import com.pulumi.azure.logicapps.inputs.GetStandardSiteConfigIpRestriction;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetStandardSiteConfig extends com.pulumi.resources.InvokeArgs {

    public static final GetStandardSiteConfig Empty = new GetStandardSiteConfig();

    @Import(name="alwaysOn")
    private @Nullable Boolean alwaysOn;

    public Optional<Boolean> alwaysOn() {
        return Optional.ofNullable(this.alwaysOn);
    }

    @Import(name="appScaleLimit", required=true)
    private Integer appScaleLimit;

    public Integer appScaleLimit() {
        return this.appScaleLimit;
    }

    @Import(name="cors", required=true)
    private GetStandardSiteConfigCors cors;

    public GetStandardSiteConfigCors cors() {
        return this.cors;
    }

    @Import(name="dotnetFrameworkVersion")
    private @Nullable String dotnetFrameworkVersion;

    public Optional<String> dotnetFrameworkVersion() {
        return Optional.ofNullable(this.dotnetFrameworkVersion);
    }

    @Import(name="elasticInstanceMinimum", required=true)
    private Integer elasticInstanceMinimum;

    public Integer elasticInstanceMinimum() {
        return this.elasticInstanceMinimum;
    }

    @Import(name="ftpsState", required=true)
    private String ftpsState;

    public String ftpsState() {
        return this.ftpsState;
    }

    @Import(name="healthCheckPath")
    private @Nullable String healthCheckPath;

    public Optional<String> healthCheckPath() {
        return Optional.ofNullable(this.healthCheckPath);
    }

    @Import(name="http2Enabled")
    private @Nullable Boolean http2Enabled;

    public Optional<Boolean> http2Enabled() {
        return Optional.ofNullable(this.http2Enabled);
    }

    @Import(name="ipRestrictions", required=true)
    private List<GetStandardSiteConfigIpRestriction> ipRestrictions;

    public List<GetStandardSiteConfigIpRestriction> ipRestrictions() {
        return this.ipRestrictions;
    }

    @Import(name="linuxFxVersion", required=true)
    private String linuxFxVersion;

    public String linuxFxVersion() {
        return this.linuxFxVersion;
    }

    @Import(name="minTlsVersion", required=true)
    private String minTlsVersion;

    public String minTlsVersion() {
        return this.minTlsVersion;
    }

    @Import(name="preWarmedInstanceCount", required=true)
    private Integer preWarmedInstanceCount;

    public Integer preWarmedInstanceCount() {
        return this.preWarmedInstanceCount;
    }

    @Import(name="runtimeScaleMonitoringEnabled")
    private @Nullable Boolean runtimeScaleMonitoringEnabled;

    public Optional<Boolean> runtimeScaleMonitoringEnabled() {
        return Optional.ofNullable(this.runtimeScaleMonitoringEnabled);
    }

    @Import(name="use32BitWorkerProcess")
    private @Nullable Boolean use32BitWorkerProcess;

    public Optional<Boolean> use32BitWorkerProcess() {
        return Optional.ofNullable(this.use32BitWorkerProcess);
    }

    @Import(name="vnetRouteAllEnabled", required=true)
    private Boolean vnetRouteAllEnabled;

    public Boolean vnetRouteAllEnabled() {
        return this.vnetRouteAllEnabled;
    }

    @Import(name="websocketsEnabled")
    private @Nullable Boolean websocketsEnabled;

    public Optional<Boolean> websocketsEnabled() {
        return Optional.ofNullable(this.websocketsEnabled);
    }

    private GetStandardSiteConfig() {}

    private GetStandardSiteConfig(GetStandardSiteConfig $) {
        this.alwaysOn = $.alwaysOn;
        this.appScaleLimit = $.appScaleLimit;
        this.cors = $.cors;
        this.dotnetFrameworkVersion = $.dotnetFrameworkVersion;
        this.elasticInstanceMinimum = $.elasticInstanceMinimum;
        this.ftpsState = $.ftpsState;
        this.healthCheckPath = $.healthCheckPath;
        this.http2Enabled = $.http2Enabled;
        this.ipRestrictions = $.ipRestrictions;
        this.linuxFxVersion = $.linuxFxVersion;
        this.minTlsVersion = $.minTlsVersion;
        this.preWarmedInstanceCount = $.preWarmedInstanceCount;
        this.runtimeScaleMonitoringEnabled = $.runtimeScaleMonitoringEnabled;
        this.use32BitWorkerProcess = $.use32BitWorkerProcess;
        this.vnetRouteAllEnabled = $.vnetRouteAllEnabled;
        this.websocketsEnabled = $.websocketsEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStandardSiteConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStandardSiteConfig $;

        public Builder() {
            $ = new GetStandardSiteConfig();
        }

        public Builder(GetStandardSiteConfig defaults) {
            $ = new GetStandardSiteConfig(Objects.requireNonNull(defaults));
        }

        public Builder alwaysOn(@Nullable Boolean alwaysOn) {
            $.alwaysOn = alwaysOn;
            return this;
        }

        public Builder appScaleLimit(Integer appScaleLimit) {
            $.appScaleLimit = appScaleLimit;
            return this;
        }

        public Builder cors(GetStandardSiteConfigCors cors) {
            $.cors = cors;
            return this;
        }

        public Builder dotnetFrameworkVersion(@Nullable String dotnetFrameworkVersion) {
            $.dotnetFrameworkVersion = dotnetFrameworkVersion;
            return this;
        }

        public Builder elasticInstanceMinimum(Integer elasticInstanceMinimum) {
            $.elasticInstanceMinimum = elasticInstanceMinimum;
            return this;
        }

        public Builder ftpsState(String ftpsState) {
            $.ftpsState = ftpsState;
            return this;
        }

        public Builder healthCheckPath(@Nullable String healthCheckPath) {
            $.healthCheckPath = healthCheckPath;
            return this;
        }

        public Builder http2Enabled(@Nullable Boolean http2Enabled) {
            $.http2Enabled = http2Enabled;
            return this;
        }

        public Builder ipRestrictions(List<GetStandardSiteConfigIpRestriction> ipRestrictions) {
            $.ipRestrictions = ipRestrictions;
            return this;
        }

        public Builder ipRestrictions(GetStandardSiteConfigIpRestriction... ipRestrictions) {
            return ipRestrictions(List.of(ipRestrictions));
        }

        public Builder linuxFxVersion(String linuxFxVersion) {
            $.linuxFxVersion = linuxFxVersion;
            return this;
        }

        public Builder minTlsVersion(String minTlsVersion) {
            $.minTlsVersion = minTlsVersion;
            return this;
        }

        public Builder preWarmedInstanceCount(Integer preWarmedInstanceCount) {
            $.preWarmedInstanceCount = preWarmedInstanceCount;
            return this;
        }

        public Builder runtimeScaleMonitoringEnabled(@Nullable Boolean runtimeScaleMonitoringEnabled) {
            $.runtimeScaleMonitoringEnabled = runtimeScaleMonitoringEnabled;
            return this;
        }

        public Builder use32BitWorkerProcess(@Nullable Boolean use32BitWorkerProcess) {
            $.use32BitWorkerProcess = use32BitWorkerProcess;
            return this;
        }

        public Builder vnetRouteAllEnabled(Boolean vnetRouteAllEnabled) {
            $.vnetRouteAllEnabled = vnetRouteAllEnabled;
            return this;
        }

        public Builder websocketsEnabled(@Nullable Boolean websocketsEnabled) {
            $.websocketsEnabled = websocketsEnabled;
            return this;
        }

        public GetStandardSiteConfig build() {
            $.appScaleLimit = Objects.requireNonNull($.appScaleLimit, "expected parameter 'appScaleLimit' to be non-null");
            $.cors = Objects.requireNonNull($.cors, "expected parameter 'cors' to be non-null");
            $.elasticInstanceMinimum = Objects.requireNonNull($.elasticInstanceMinimum, "expected parameter 'elasticInstanceMinimum' to be non-null");
            $.ftpsState = Objects.requireNonNull($.ftpsState, "expected parameter 'ftpsState' to be non-null");
            $.ipRestrictions = Objects.requireNonNull($.ipRestrictions, "expected parameter 'ipRestrictions' to be non-null");
            $.linuxFxVersion = Objects.requireNonNull($.linuxFxVersion, "expected parameter 'linuxFxVersion' to be non-null");
            $.minTlsVersion = Objects.requireNonNull($.minTlsVersion, "expected parameter 'minTlsVersion' to be non-null");
            $.preWarmedInstanceCount = Objects.requireNonNull($.preWarmedInstanceCount, "expected parameter 'preWarmedInstanceCount' to be non-null");
            $.vnetRouteAllEnabled = Objects.requireNonNull($.vnetRouteAllEnabled, "expected parameter 'vnetRouteAllEnabled' to be non-null");
            return $;
        }
    }

}
