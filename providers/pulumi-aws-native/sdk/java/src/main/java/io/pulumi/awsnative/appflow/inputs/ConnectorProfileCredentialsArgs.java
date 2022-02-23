// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.inputs.ConnectorProfileAmplitudeConnectorProfileCredentialsArgs;
import io.pulumi.awsnative.appflow.inputs.ConnectorProfileDatadogConnectorProfileCredentialsArgs;
import io.pulumi.awsnative.appflow.inputs.ConnectorProfileDynatraceConnectorProfileCredentialsArgs;
import io.pulumi.awsnative.appflow.inputs.ConnectorProfileGoogleAnalyticsConnectorProfileCredentialsArgs;
import io.pulumi.awsnative.appflow.inputs.ConnectorProfileInforNexusConnectorProfileCredentialsArgs;
import io.pulumi.awsnative.appflow.inputs.ConnectorProfileMarketoConnectorProfileCredentialsArgs;
import io.pulumi.awsnative.appflow.inputs.ConnectorProfileRedshiftConnectorProfileCredentialsArgs;
import io.pulumi.awsnative.appflow.inputs.ConnectorProfileSAPODataConnectorProfileCredentialsArgs;
import io.pulumi.awsnative.appflow.inputs.ConnectorProfileSalesforceConnectorProfileCredentialsArgs;
import io.pulumi.awsnative.appflow.inputs.ConnectorProfileServiceNowConnectorProfileCredentialsArgs;
import io.pulumi.awsnative.appflow.inputs.ConnectorProfileSingularConnectorProfileCredentialsArgs;
import io.pulumi.awsnative.appflow.inputs.ConnectorProfileSlackConnectorProfileCredentialsArgs;
import io.pulumi.awsnative.appflow.inputs.ConnectorProfileSnowflakeConnectorProfileCredentialsArgs;
import io.pulumi.awsnative.appflow.inputs.ConnectorProfileTrendmicroConnectorProfileCredentialsArgs;
import io.pulumi.awsnative.appflow.inputs.ConnectorProfileVeevaConnectorProfileCredentialsArgs;
import io.pulumi.awsnative.appflow.inputs.ConnectorProfileZendeskConnectorProfileCredentialsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Connector specific configuration needed to create connector profile based on Authentication mechanism
 * 
 */
public final class ConnectorProfileCredentialsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileCredentialsArgs Empty = new ConnectorProfileCredentialsArgs();

    @InputImport(name="amplitude")
        private final @Nullable Input<ConnectorProfileAmplitudeConnectorProfileCredentialsArgs> amplitude;

    public Input<ConnectorProfileAmplitudeConnectorProfileCredentialsArgs> getAmplitude() {
        return this.amplitude == null ? Input.empty() : this.amplitude;
    }

    @InputImport(name="datadog")
        private final @Nullable Input<ConnectorProfileDatadogConnectorProfileCredentialsArgs> datadog;

    public Input<ConnectorProfileDatadogConnectorProfileCredentialsArgs> getDatadog() {
        return this.datadog == null ? Input.empty() : this.datadog;
    }

    @InputImport(name="dynatrace")
        private final @Nullable Input<ConnectorProfileDynatraceConnectorProfileCredentialsArgs> dynatrace;

    public Input<ConnectorProfileDynatraceConnectorProfileCredentialsArgs> getDynatrace() {
        return this.dynatrace == null ? Input.empty() : this.dynatrace;
    }

    @InputImport(name="googleAnalytics")
        private final @Nullable Input<ConnectorProfileGoogleAnalyticsConnectorProfileCredentialsArgs> googleAnalytics;

    public Input<ConnectorProfileGoogleAnalyticsConnectorProfileCredentialsArgs> getGoogleAnalytics() {
        return this.googleAnalytics == null ? Input.empty() : this.googleAnalytics;
    }

    @InputImport(name="inforNexus")
        private final @Nullable Input<ConnectorProfileInforNexusConnectorProfileCredentialsArgs> inforNexus;

    public Input<ConnectorProfileInforNexusConnectorProfileCredentialsArgs> getInforNexus() {
        return this.inforNexus == null ? Input.empty() : this.inforNexus;
    }

    @InputImport(name="marketo")
        private final @Nullable Input<ConnectorProfileMarketoConnectorProfileCredentialsArgs> marketo;

    public Input<ConnectorProfileMarketoConnectorProfileCredentialsArgs> getMarketo() {
        return this.marketo == null ? Input.empty() : this.marketo;
    }

    @InputImport(name="redshift")
        private final @Nullable Input<ConnectorProfileRedshiftConnectorProfileCredentialsArgs> redshift;

    public Input<ConnectorProfileRedshiftConnectorProfileCredentialsArgs> getRedshift() {
        return this.redshift == null ? Input.empty() : this.redshift;
    }

    @InputImport(name="sAPOData")
        private final @Nullable Input<ConnectorProfileSAPODataConnectorProfileCredentialsArgs> sAPOData;

    public Input<ConnectorProfileSAPODataConnectorProfileCredentialsArgs> getSAPOData() {
        return this.sAPOData == null ? Input.empty() : this.sAPOData;
    }

    @InputImport(name="salesforce")
        private final @Nullable Input<ConnectorProfileSalesforceConnectorProfileCredentialsArgs> salesforce;

    public Input<ConnectorProfileSalesforceConnectorProfileCredentialsArgs> getSalesforce() {
        return this.salesforce == null ? Input.empty() : this.salesforce;
    }

    @InputImport(name="serviceNow")
        private final @Nullable Input<ConnectorProfileServiceNowConnectorProfileCredentialsArgs> serviceNow;

    public Input<ConnectorProfileServiceNowConnectorProfileCredentialsArgs> getServiceNow() {
        return this.serviceNow == null ? Input.empty() : this.serviceNow;
    }

    @InputImport(name="singular")
        private final @Nullable Input<ConnectorProfileSingularConnectorProfileCredentialsArgs> singular;

    public Input<ConnectorProfileSingularConnectorProfileCredentialsArgs> getSingular() {
        return this.singular == null ? Input.empty() : this.singular;
    }

    @InputImport(name="slack")
        private final @Nullable Input<ConnectorProfileSlackConnectorProfileCredentialsArgs> slack;

    public Input<ConnectorProfileSlackConnectorProfileCredentialsArgs> getSlack() {
        return this.slack == null ? Input.empty() : this.slack;
    }

    @InputImport(name="snowflake")
        private final @Nullable Input<ConnectorProfileSnowflakeConnectorProfileCredentialsArgs> snowflake;

    public Input<ConnectorProfileSnowflakeConnectorProfileCredentialsArgs> getSnowflake() {
        return this.snowflake == null ? Input.empty() : this.snowflake;
    }

    @InputImport(name="trendmicro")
        private final @Nullable Input<ConnectorProfileTrendmicroConnectorProfileCredentialsArgs> trendmicro;

    public Input<ConnectorProfileTrendmicroConnectorProfileCredentialsArgs> getTrendmicro() {
        return this.trendmicro == null ? Input.empty() : this.trendmicro;
    }

    @InputImport(name="veeva")
        private final @Nullable Input<ConnectorProfileVeevaConnectorProfileCredentialsArgs> veeva;

    public Input<ConnectorProfileVeevaConnectorProfileCredentialsArgs> getVeeva() {
        return this.veeva == null ? Input.empty() : this.veeva;
    }

    @InputImport(name="zendesk")
        private final @Nullable Input<ConnectorProfileZendeskConnectorProfileCredentialsArgs> zendesk;

    public Input<ConnectorProfileZendeskConnectorProfileCredentialsArgs> getZendesk() {
        return this.zendesk == null ? Input.empty() : this.zendesk;
    }

    public ConnectorProfileCredentialsArgs(
        @Nullable Input<ConnectorProfileAmplitudeConnectorProfileCredentialsArgs> amplitude,
        @Nullable Input<ConnectorProfileDatadogConnectorProfileCredentialsArgs> datadog,
        @Nullable Input<ConnectorProfileDynatraceConnectorProfileCredentialsArgs> dynatrace,
        @Nullable Input<ConnectorProfileGoogleAnalyticsConnectorProfileCredentialsArgs> googleAnalytics,
        @Nullable Input<ConnectorProfileInforNexusConnectorProfileCredentialsArgs> inforNexus,
        @Nullable Input<ConnectorProfileMarketoConnectorProfileCredentialsArgs> marketo,
        @Nullable Input<ConnectorProfileRedshiftConnectorProfileCredentialsArgs> redshift,
        @Nullable Input<ConnectorProfileSAPODataConnectorProfileCredentialsArgs> sAPOData,
        @Nullable Input<ConnectorProfileSalesforceConnectorProfileCredentialsArgs> salesforce,
        @Nullable Input<ConnectorProfileServiceNowConnectorProfileCredentialsArgs> serviceNow,
        @Nullable Input<ConnectorProfileSingularConnectorProfileCredentialsArgs> singular,
        @Nullable Input<ConnectorProfileSlackConnectorProfileCredentialsArgs> slack,
        @Nullable Input<ConnectorProfileSnowflakeConnectorProfileCredentialsArgs> snowflake,
        @Nullable Input<ConnectorProfileTrendmicroConnectorProfileCredentialsArgs> trendmicro,
        @Nullable Input<ConnectorProfileVeevaConnectorProfileCredentialsArgs> veeva,
        @Nullable Input<ConnectorProfileZendeskConnectorProfileCredentialsArgs> zendesk) {
        this.amplitude = amplitude;
        this.datadog = datadog;
        this.dynatrace = dynatrace;
        this.googleAnalytics = googleAnalytics;
        this.inforNexus = inforNexus;
        this.marketo = marketo;
        this.redshift = redshift;
        this.sAPOData = sAPOData;
        this.salesforce = salesforce;
        this.serviceNow = serviceNow;
        this.singular = singular;
        this.slack = slack;
        this.snowflake = snowflake;
        this.trendmicro = trendmicro;
        this.veeva = veeva;
        this.zendesk = zendesk;
    }

    private ConnectorProfileCredentialsArgs() {
        this.amplitude = Input.empty();
        this.datadog = Input.empty();
        this.dynatrace = Input.empty();
        this.googleAnalytics = Input.empty();
        this.inforNexus = Input.empty();
        this.marketo = Input.empty();
        this.redshift = Input.empty();
        this.sAPOData = Input.empty();
        this.salesforce = Input.empty();
        this.serviceNow = Input.empty();
        this.singular = Input.empty();
        this.slack = Input.empty();
        this.snowflake = Input.empty();
        this.trendmicro = Input.empty();
        this.veeva = Input.empty();
        this.zendesk = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConnectorProfileAmplitudeConnectorProfileCredentialsArgs> amplitude;
        private @Nullable Input<ConnectorProfileDatadogConnectorProfileCredentialsArgs> datadog;
        private @Nullable Input<ConnectorProfileDynatraceConnectorProfileCredentialsArgs> dynatrace;
        private @Nullable Input<ConnectorProfileGoogleAnalyticsConnectorProfileCredentialsArgs> googleAnalytics;
        private @Nullable Input<ConnectorProfileInforNexusConnectorProfileCredentialsArgs> inforNexus;
        private @Nullable Input<ConnectorProfileMarketoConnectorProfileCredentialsArgs> marketo;
        private @Nullable Input<ConnectorProfileRedshiftConnectorProfileCredentialsArgs> redshift;
        private @Nullable Input<ConnectorProfileSAPODataConnectorProfileCredentialsArgs> sAPOData;
        private @Nullable Input<ConnectorProfileSalesforceConnectorProfileCredentialsArgs> salesforce;
        private @Nullable Input<ConnectorProfileServiceNowConnectorProfileCredentialsArgs> serviceNow;
        private @Nullable Input<ConnectorProfileSingularConnectorProfileCredentialsArgs> singular;
        private @Nullable Input<ConnectorProfileSlackConnectorProfileCredentialsArgs> slack;
        private @Nullable Input<ConnectorProfileSnowflakeConnectorProfileCredentialsArgs> snowflake;
        private @Nullable Input<ConnectorProfileTrendmicroConnectorProfileCredentialsArgs> trendmicro;
        private @Nullable Input<ConnectorProfileVeevaConnectorProfileCredentialsArgs> veeva;
        private @Nullable Input<ConnectorProfileZendeskConnectorProfileCredentialsArgs> zendesk;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileCredentialsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amplitude = defaults.amplitude;
    	      this.datadog = defaults.datadog;
    	      this.dynatrace = defaults.dynatrace;
    	      this.googleAnalytics = defaults.googleAnalytics;
    	      this.inforNexus = defaults.inforNexus;
    	      this.marketo = defaults.marketo;
    	      this.redshift = defaults.redshift;
    	      this.sAPOData = defaults.sAPOData;
    	      this.salesforce = defaults.salesforce;
    	      this.serviceNow = defaults.serviceNow;
    	      this.singular = defaults.singular;
    	      this.slack = defaults.slack;
    	      this.snowflake = defaults.snowflake;
    	      this.trendmicro = defaults.trendmicro;
    	      this.veeva = defaults.veeva;
    	      this.zendesk = defaults.zendesk;
        }

        public Builder setAmplitude(@Nullable Input<ConnectorProfileAmplitudeConnectorProfileCredentialsArgs> amplitude) {
            this.amplitude = amplitude;
            return this;
        }

        public Builder setAmplitude(@Nullable ConnectorProfileAmplitudeConnectorProfileCredentialsArgs amplitude) {
            this.amplitude = Input.ofNullable(amplitude);
            return this;
        }

        public Builder setDatadog(@Nullable Input<ConnectorProfileDatadogConnectorProfileCredentialsArgs> datadog) {
            this.datadog = datadog;
            return this;
        }

        public Builder setDatadog(@Nullable ConnectorProfileDatadogConnectorProfileCredentialsArgs datadog) {
            this.datadog = Input.ofNullable(datadog);
            return this;
        }

        public Builder setDynatrace(@Nullable Input<ConnectorProfileDynatraceConnectorProfileCredentialsArgs> dynatrace) {
            this.dynatrace = dynatrace;
            return this;
        }

        public Builder setDynatrace(@Nullable ConnectorProfileDynatraceConnectorProfileCredentialsArgs dynatrace) {
            this.dynatrace = Input.ofNullable(dynatrace);
            return this;
        }

        public Builder setGoogleAnalytics(@Nullable Input<ConnectorProfileGoogleAnalyticsConnectorProfileCredentialsArgs> googleAnalytics) {
            this.googleAnalytics = googleAnalytics;
            return this;
        }

        public Builder setGoogleAnalytics(@Nullable ConnectorProfileGoogleAnalyticsConnectorProfileCredentialsArgs googleAnalytics) {
            this.googleAnalytics = Input.ofNullable(googleAnalytics);
            return this;
        }

        public Builder setInforNexus(@Nullable Input<ConnectorProfileInforNexusConnectorProfileCredentialsArgs> inforNexus) {
            this.inforNexus = inforNexus;
            return this;
        }

        public Builder setInforNexus(@Nullable ConnectorProfileInforNexusConnectorProfileCredentialsArgs inforNexus) {
            this.inforNexus = Input.ofNullable(inforNexus);
            return this;
        }

        public Builder setMarketo(@Nullable Input<ConnectorProfileMarketoConnectorProfileCredentialsArgs> marketo) {
            this.marketo = marketo;
            return this;
        }

        public Builder setMarketo(@Nullable ConnectorProfileMarketoConnectorProfileCredentialsArgs marketo) {
            this.marketo = Input.ofNullable(marketo);
            return this;
        }

        public Builder setRedshift(@Nullable Input<ConnectorProfileRedshiftConnectorProfileCredentialsArgs> redshift) {
            this.redshift = redshift;
            return this;
        }

        public Builder setRedshift(@Nullable ConnectorProfileRedshiftConnectorProfileCredentialsArgs redshift) {
            this.redshift = Input.ofNullable(redshift);
            return this;
        }

        public Builder setSAPOData(@Nullable Input<ConnectorProfileSAPODataConnectorProfileCredentialsArgs> sAPOData) {
            this.sAPOData = sAPOData;
            return this;
        }

        public Builder setSAPOData(@Nullable ConnectorProfileSAPODataConnectorProfileCredentialsArgs sAPOData) {
            this.sAPOData = Input.ofNullable(sAPOData);
            return this;
        }

        public Builder setSalesforce(@Nullable Input<ConnectorProfileSalesforceConnectorProfileCredentialsArgs> salesforce) {
            this.salesforce = salesforce;
            return this;
        }

        public Builder setSalesforce(@Nullable ConnectorProfileSalesforceConnectorProfileCredentialsArgs salesforce) {
            this.salesforce = Input.ofNullable(salesforce);
            return this;
        }

        public Builder setServiceNow(@Nullable Input<ConnectorProfileServiceNowConnectorProfileCredentialsArgs> serviceNow) {
            this.serviceNow = serviceNow;
            return this;
        }

        public Builder setServiceNow(@Nullable ConnectorProfileServiceNowConnectorProfileCredentialsArgs serviceNow) {
            this.serviceNow = Input.ofNullable(serviceNow);
            return this;
        }

        public Builder setSingular(@Nullable Input<ConnectorProfileSingularConnectorProfileCredentialsArgs> singular) {
            this.singular = singular;
            return this;
        }

        public Builder setSingular(@Nullable ConnectorProfileSingularConnectorProfileCredentialsArgs singular) {
            this.singular = Input.ofNullable(singular);
            return this;
        }

        public Builder setSlack(@Nullable Input<ConnectorProfileSlackConnectorProfileCredentialsArgs> slack) {
            this.slack = slack;
            return this;
        }

        public Builder setSlack(@Nullable ConnectorProfileSlackConnectorProfileCredentialsArgs slack) {
            this.slack = Input.ofNullable(slack);
            return this;
        }

        public Builder setSnowflake(@Nullable Input<ConnectorProfileSnowflakeConnectorProfileCredentialsArgs> snowflake) {
            this.snowflake = snowflake;
            return this;
        }

        public Builder setSnowflake(@Nullable ConnectorProfileSnowflakeConnectorProfileCredentialsArgs snowflake) {
            this.snowflake = Input.ofNullable(snowflake);
            return this;
        }

        public Builder setTrendmicro(@Nullable Input<ConnectorProfileTrendmicroConnectorProfileCredentialsArgs> trendmicro) {
            this.trendmicro = trendmicro;
            return this;
        }

        public Builder setTrendmicro(@Nullable ConnectorProfileTrendmicroConnectorProfileCredentialsArgs trendmicro) {
            this.trendmicro = Input.ofNullable(trendmicro);
            return this;
        }

        public Builder setVeeva(@Nullable Input<ConnectorProfileVeevaConnectorProfileCredentialsArgs> veeva) {
            this.veeva = veeva;
            return this;
        }

        public Builder setVeeva(@Nullable ConnectorProfileVeevaConnectorProfileCredentialsArgs veeva) {
            this.veeva = Input.ofNullable(veeva);
            return this;
        }

        public Builder setZendesk(@Nullable Input<ConnectorProfileZendeskConnectorProfileCredentialsArgs> zendesk) {
            this.zendesk = zendesk;
            return this;
        }

        public Builder setZendesk(@Nullable ConnectorProfileZendeskConnectorProfileCredentialsArgs zendesk) {
            this.zendesk = Input.ofNullable(zendesk);
            return this;
        }
        public ConnectorProfileCredentialsArgs build() {
            return new ConnectorProfileCredentialsArgs(amplitude, datadog, dynatrace, googleAnalytics, inforNexus, marketo, redshift, sAPOData, salesforce, serviceNow, singular, slack, snowflake, trendmicro, veeva, zendesk);
        }
    }
}
