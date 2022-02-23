// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.recaptcha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EnterpriseKeyWebSettings {
    /**
     * If set to true, it means allowed_domains will not be enforced.
     * 
     */
    private final @Nullable Boolean allowAllDomains;
    /**
     * If set to true, the key can be used on AMP (Accelerated Mobile Pages) websites. This is supported only for the SCORE integration type.
     * 
     */
    private final @Nullable Boolean allowAmpTraffic;
    /**
     * Domains or subdomains of websites allowed to use the key. All subdomains of an allowed domain are automatically allowed. A valid domain requires a host and must not include any path, port, query or fragment. Examples: 'example.com' or 'subdomain.example.com'
     * 
     */
    private final @Nullable List<String> allowedDomains;
    /**
     * Settings for the frequency and difficulty at which this key triggers captcha challenges. This should only be specified for IntegrationTypes CHECKBOX and INVISIBLE. Possible values: CHALLENGE_SECURITY_PREFERENCE_UNSPECIFIED, USABILITY, BALANCE, SECURITY
     * 
     */
    private final @Nullable String challengeSecurityPreference;
    /**
     * Required. Describes how this key is integrated with the website. Possible values: SCORE, CHECKBOX, INVISIBLE
     * 
     */
    private final String integrationType;

    @OutputCustomType.Constructor({"allowAllDomains","allowAmpTraffic","allowedDomains","challengeSecurityPreference","integrationType"})
    private EnterpriseKeyWebSettings(
        @Nullable Boolean allowAllDomains,
        @Nullable Boolean allowAmpTraffic,
        @Nullable List<String> allowedDomains,
        @Nullable String challengeSecurityPreference,
        String integrationType) {
        this.allowAllDomains = allowAllDomains;
        this.allowAmpTraffic = allowAmpTraffic;
        this.allowedDomains = allowedDomains;
        this.challengeSecurityPreference = challengeSecurityPreference;
        this.integrationType = Objects.requireNonNull(integrationType);
    }

    /**
     * If set to true, it means allowed_domains will not be enforced.
     * 
     */
    public Optional<Boolean> getAllowAllDomains() {
        return Optional.ofNullable(this.allowAllDomains);
    }
    /**
     * If set to true, the key can be used on AMP (Accelerated Mobile Pages) websites. This is supported only for the SCORE integration type.
     * 
     */
    public Optional<Boolean> getAllowAmpTraffic() {
        return Optional.ofNullable(this.allowAmpTraffic);
    }
    /**
     * Domains or subdomains of websites allowed to use the key. All subdomains of an allowed domain are automatically allowed. A valid domain requires a host and must not include any path, port, query or fragment. Examples: 'example.com' or 'subdomain.example.com'
     * 
     */
    public List<String> getAllowedDomains() {
        return this.allowedDomains == null ? List.of() : this.allowedDomains;
    }
    /**
     * Settings for the frequency and difficulty at which this key triggers captcha challenges. This should only be specified for IntegrationTypes CHECKBOX and INVISIBLE. Possible values: CHALLENGE_SECURITY_PREFERENCE_UNSPECIFIED, USABILITY, BALANCE, SECURITY
     * 
     */
    public Optional<String> getChallengeSecurityPreference() {
        return Optional.ofNullable(this.challengeSecurityPreference);
    }
    /**
     * Required. Describes how this key is integrated with the website. Possible values: SCORE, CHECKBOX, INVISIBLE
     * 
     */
    public String getIntegrationType() {
        return this.integrationType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseKeyWebSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowAllDomains;
        private @Nullable Boolean allowAmpTraffic;
        private @Nullable List<String> allowedDomains;
        private @Nullable String challengeSecurityPreference;
        private String integrationType;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterpriseKeyWebSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAllDomains = defaults.allowAllDomains;
    	      this.allowAmpTraffic = defaults.allowAmpTraffic;
    	      this.allowedDomains = defaults.allowedDomains;
    	      this.challengeSecurityPreference = defaults.challengeSecurityPreference;
    	      this.integrationType = defaults.integrationType;
        }

        public Builder setAllowAllDomains(@Nullable Boolean allowAllDomains) {
            this.allowAllDomains = allowAllDomains;
            return this;
        }

        public Builder setAllowAmpTraffic(@Nullable Boolean allowAmpTraffic) {
            this.allowAmpTraffic = allowAmpTraffic;
            return this;
        }

        public Builder setAllowedDomains(@Nullable List<String> allowedDomains) {
            this.allowedDomains = allowedDomains;
            return this;
        }

        public Builder setChallengeSecurityPreference(@Nullable String challengeSecurityPreference) {
            this.challengeSecurityPreference = challengeSecurityPreference;
            return this;
        }

        public Builder setIntegrationType(String integrationType) {
            this.integrationType = Objects.requireNonNull(integrationType);
            return this;
        }
        public EnterpriseKeyWebSettings build() {
            return new EnterpriseKeyWebSettings(allowAllDomains, allowAmpTraffic, allowedDomains, challengeSecurityPreference, integrationType);
        }
    }
}
