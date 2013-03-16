(ns lobos.config
  (:use lobos.connectivity)
  (:require [ltest.models.schema :as schema]))

(open-global schema/db-spec)
