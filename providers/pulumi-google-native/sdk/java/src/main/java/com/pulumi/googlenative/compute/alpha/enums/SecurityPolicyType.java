// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type indicates the intended use of the security policy. - CLOUD_ARMOR: Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers. - CLOUD_ARMOR_EDGE: Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google&#39;s cache. - CLOUD_ARMOR_INTERNAL_SERVICE: Cloud Armor internal service policies can be configured to filter HTTP requests targeting services managed by Traffic Director in a service mesh. They filter requests before the request is served from the application. This field can be set only at resource creation time.
     * 
     */
    @EnumType
    public enum SecurityPolicyType {
        CloudArmor("CLOUD_ARMOR"),
        CloudArmorEdge("CLOUD_ARMOR_EDGE"),
        CloudArmorInternalService("CLOUD_ARMOR_INTERNAL_SERVICE"),
        CloudArmorNetwork("CLOUD_ARMOR_NETWORK"),
        Firewall("FIREWALL");

        private final String value;

        SecurityPolicyType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SecurityPolicyType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
