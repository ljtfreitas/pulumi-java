// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.accesscontextmanager.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Perimeter type indicator. A single project is allowed to be a member of single regular perimeter, but multiple service perimeter bridges. A project cannot be a included in a perimeter bridge without being included in regular perimeter. For perimeter bridges, the restricted service list as well as access level lists must be empty.
     * 
     */
    @EnumType
    public enum ServicePerimeterPerimeterType {
        /**
         * Regular Perimeter.
         * 
         */
        PerimeterTypeRegular("PERIMETER_TYPE_REGULAR"),
        /**
         * Perimeter Bridge.
         * 
         */
        PerimeterTypeBridge("PERIMETER_TYPE_BRIDGE");

        private final String value;

        ServicePerimeterPerimeterType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ServicePerimeterPerimeterType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
