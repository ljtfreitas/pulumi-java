// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNamesArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNamesArgs Empty = new CertificateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNamesArgs();

    /**
     * A list of alternative DNS names (FQDNs) identified by the Certificate. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="dnsNames")
    private @Nullable Output<List<String>> dnsNames;

    /**
     * @return A list of alternative DNS names (FQDNs) identified by the Certificate. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<List<String>>> dnsNames() {
        return Optional.ofNullable(this.dnsNames);
    }

    /**
     * A list of email addresses identified by this Certificate. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="emails")
    private @Nullable Output<List<String>> emails;

    /**
     * @return A list of email addresses identified by this Certificate. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<List<String>>> emails() {
        return Optional.ofNullable(this.emails);
    }

    /**
     * A list of User Principal Names identified by the Certificate. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="upns")
    private @Nullable Output<List<String>> upns;

    /**
     * @return A list of User Principal Names identified by the Certificate. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<List<String>>> upns() {
        return Optional.ofNullable(this.upns);
    }

    private CertificateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNamesArgs() {}

    private CertificateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNamesArgs(CertificateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNamesArgs $) {
        this.dnsNames = $.dnsNames;
        this.emails = $.emails;
        this.upns = $.upns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNamesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNamesArgs $;

        public Builder() {
            $ = new CertificateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNamesArgs();
        }

        public Builder(CertificateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNamesArgs defaults) {
            $ = new CertificateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNamesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dnsNames A list of alternative DNS names (FQDNs) identified by the Certificate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder dnsNames(@Nullable Output<List<String>> dnsNames) {
            $.dnsNames = dnsNames;
            return this;
        }

        /**
         * @param dnsNames A list of alternative DNS names (FQDNs) identified by the Certificate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder dnsNames(List<String> dnsNames) {
            return dnsNames(Output.of(dnsNames));
        }

        /**
         * @param dnsNames A list of alternative DNS names (FQDNs) identified by the Certificate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder dnsNames(String... dnsNames) {
            return dnsNames(List.of(dnsNames));
        }

        /**
         * @param emails A list of email addresses identified by this Certificate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder emails(@Nullable Output<List<String>> emails) {
            $.emails = emails;
            return this;
        }

        /**
         * @param emails A list of email addresses identified by this Certificate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder emails(List<String> emails) {
            return emails(Output.of(emails));
        }

        /**
         * @param emails A list of email addresses identified by this Certificate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder emails(String... emails) {
            return emails(List.of(emails));
        }

        /**
         * @param upns A list of User Principal Names identified by the Certificate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder upns(@Nullable Output<List<String>> upns) {
            $.upns = upns;
            return this;
        }

        /**
         * @param upns A list of User Principal Names identified by the Certificate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder upns(List<String> upns) {
            return upns(Output.of(upns));
        }

        /**
         * @param upns A list of User Principal Names identified by the Certificate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder upns(String... upns) {
            return upns(List.of(upns));
        }

        public CertificateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNamesArgs build() {
            return $;
        }
    }

}
